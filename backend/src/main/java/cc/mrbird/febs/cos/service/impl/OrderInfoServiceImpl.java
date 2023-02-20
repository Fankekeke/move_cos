package cc.mrbird.febs.cos.service.impl;

import cc.mrbird.febs.cos.dao.UserInfoMapper;
import cc.mrbird.febs.cos.entity.OrderInfo;
import cc.mrbird.febs.cos.dao.OrderInfoMapper;
import cc.mrbird.febs.cos.entity.PaymentRecord;
import cc.mrbird.febs.cos.entity.StaffInfo;
import cc.mrbird.febs.cos.service.*;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author FanK
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements IOrderInfoService {

    private final IOrderDistributeService orderDistributeService;

    private final IStaffInfoService staffInfoService;

    private final IBulletinInfoService bulletinInfoService;

    private final UserInfoMapper userInfoMapper;

    private final IPaymentRecordService paymentRecordService;

    /**
     * 分页获取订单信息
     *
     * @param page      分页对象
     * @param orderInfo 订单信息
     * @return 结果
     */
    @Override
    public IPage<LinkedHashMap<String, Object>> selectOrderPage(Page<OrderInfo> page, OrderInfo orderInfo) {
        return baseMapper.selectOrderPage(page, orderInfo);
    }

    /**
     * 管理员对订单分配
     *
     * @param orderCode    订单编号
     * @param driverCode   司机编号
     * @param staffCodeStr 帮运
     * @return 结果
     */
    @Override
    public boolean checkOrder(String orderCode, String driverCode, String staffCodeStr) throws Exception {
        // 获取订单信息
        OrderInfo orderInfo = this.getOne(Wrappers.<OrderInfo>lambdaQuery().eq(OrderInfo::getCode, orderCode));
        if (orderInfo == null) {
            return false;
        }
        // 绑定司机
        if (StrUtil.isNotEmpty(driverCode) && orderInfo.getVehicleOptions() != null) {
            orderInfo.setDriverCode(driverCode);
        }
        // 绑定搬运工
        if (StrUtil.isNotEmpty(staffCodeStr)) {
            orderDistributeService.setOrderStaff(staffCodeStr, orderCode);
        }
        orderInfo.setStatus(2);
        return this.updateById(orderInfo);
    }

    /**
     * 主页信息
     *
     * @return 结果
     */
    @Override
    public LinkedHashMap<String, Object> homeData() {
        LinkedHashMap<String, Object> result = new LinkedHashMap<>();
        // 查询员工信息
        List<StaffInfo> staffInfoList = staffInfoService.list(Wrappers.<StaffInfo>lambdaQuery().eq(StaffInfo::getStatus, 1));
        Map<Integer, List<StaffInfo>> staffMap = staffInfoList.stream().collect(Collectors.groupingBy(StaffInfo::getType));
        // 司机
        Integer driverNum = CollectionUtil.isEmpty(staffMap.get(1)) ? 0 : staffMap.get(1).size();
        // 搬运工
        Integer staffMoveNum = CollectionUtil.isEmpty(staffMap.get(2)) ? 0 : staffMap.get(2).size();
        // 总订单数量
        Integer orderNum = this.count();
        // 总收益
        List<PaymentRecord> paymentRecordList = paymentRecordService.list();
        BigDecimal amount = CollectionUtil.isEmpty(paymentRecordList) ? BigDecimal.ZERO : paymentRecordList.stream().map(PaymentRecord::getAmount).reduce(BigDecimal.ZERO, BigDecimal::add);
        // 近十天内订单数量统计

        // 近十天内订单收益统计
        return null;
    }
}
