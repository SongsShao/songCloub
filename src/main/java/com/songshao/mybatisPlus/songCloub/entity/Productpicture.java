package com.songshao.mybatisPlus.songCloub.entity;

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
public class Productpicture implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片文字
     */
    private String image;

    /**
     * 商品编码
     */
    private Integer cid;

    /**
     * 用户编码
     */
    private Integer uid;


}
