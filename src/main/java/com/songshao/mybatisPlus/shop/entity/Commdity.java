package com.songshao.mybatisPlus.shop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class Commdity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    /**
     * 商品名称
     */
    @TableField("cName")
    private String cName;

    /**
     * 商品描述
     */
    @TableField("cDesc")
    private String cDesc;

    /**
     * 类别
     */
    @TableField("cServies")
    private String cServies;

    /**
     * 主页图片
     */
    @TableField("cImage")
    private String cImage;

    /**
     * 商品大小
     */
    private String size;

    /**
     * 商品颜色多个用|分隔
     */
    private String color;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 所属单位
     */
    @TableField("whereItBeLong")
    private Integer whereItBeLong;

    /**
     * 所属用户
     */
    @TableField("isUid")
    private Integer isUid;


}
