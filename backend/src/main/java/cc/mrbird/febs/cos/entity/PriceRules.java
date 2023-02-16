package cc.mrbird.febs.cos.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 价格规则
 *
 * @author FanK
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PriceRules implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 规则编号
     */
    private String code;

    /**
     * 规则备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;


}
