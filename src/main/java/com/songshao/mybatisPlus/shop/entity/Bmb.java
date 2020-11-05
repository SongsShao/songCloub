package com.songshao.mybatisPlus.shop.entity;

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
public class Bmb implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编码id
     */
    @TableId(value = "tid", type = IdType.AUTO)
    private Integer tid;

    /**
     * 名称一
     */
    private String mc1;

    /**
     * 编码一
     */
    private String bm1;

    /**
     * 编码类型
     */
    private String type;

    /**
     * 编码级别
     */
    private Integer level;

    /**
     * 名称二
     */
    private String mc2;

    /**
     * 编码二
     */
    private String bm2;


}
