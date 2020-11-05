package com.songshao.mybatisPlus.shop.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author songshao
 * @since 2020-11-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Evaluate implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评价编码
     */
    private Integer eid;

    /**
     * 评价内容
     */
    private String edesc;

    /**
     *  评价所属商品编码
     */
    private Integer cid;

    /**
     * 评价用户
     */
    private Integer refid;

    /**
     * 评价时间
     */
    private LocalDateTime etime;

    /**
     * 回复关联评价编码
     */
    private Integer hfid;

    /**
     * 回复至用户编码
     */
    private Integer hfuid;


}
