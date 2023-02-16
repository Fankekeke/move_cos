package cc.mrbird.febs.cos.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 消息通知
 *
 * @author FanK
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class NotifyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    private String userCode;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 删除标识
     */
    private Integer delFlag;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    private String name;


}
