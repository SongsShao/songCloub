package com.songshao.mybatisPlus.shop.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Pricelist implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 价格编码
     */
    @TableId(value = "pid", type = IdType.AUTO)
    private Integer pid;

    /**
     * 原价格
     */
    private BigDecimal yprice;

    /**
     * 优惠价格
     */
    private BigDecimal zprice;

    /**
     * 折扣比例
     */
    private BigDecimal discount;

    /**
     * 产品编码
     */
    private Integer cid;

    /**
     * 用户编码
     */
    private Integer uid;


}
