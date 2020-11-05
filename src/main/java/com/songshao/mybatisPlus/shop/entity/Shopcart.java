package com.songshao.mybatisPlus.shop.entity;

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
public class Shopcart implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 所属用户编码
     */
    private Integer ssid;

    /**
     * 商品编码
     */
    private Integer cid;

    /**
     * 购买数量
     */
    private Integer num;

    /**
     * 购买商品状态0删除1可购买
     */
    private Integer state;


}
