package cc.mrbird.febs.cos.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 缴费信息
 *
 * @author FanK
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PaymentRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    private String userCode;

    /**
     * 订单编号
     */
    private String orderCode;

    /**
     * 付款金额
     */
    private BigDecimal amount;

    /**
     * 付款时间
     */
    private LocalDateTime createDate;


}
