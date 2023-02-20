package cc.mrbird.febs.cos.service;

import cc.mrbird.febs.cos.entity.OrderInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author FanK
 */
public interface IOrderInfoService extends IService<OrderInfo> {

    /**
     * 分页获取订单信息
     *
     * @param page      分页对象
     * @param orderInfo 订单信息
     * @return 结果
     */
    IPage<LinkedHashMap<String, Object>> selectOrderPage(Page<OrderInfo> page, OrderInfo orderInfo);

    /**
     * 管理员对订单分配
     *
     * @param orderCode    订单编号
     * @param driverCode   司机编号
     * @param staffCodeStr 帮运
     * @return 结果
     */
    boolean checkOrder(String orderCode, String driverCode, String staffCodeStr) throws Exception;

    /**
     * 主页信息
     *
     * @return 结果
     */
    LinkedHashMap<String, Object> homeData(String userCode);
}
