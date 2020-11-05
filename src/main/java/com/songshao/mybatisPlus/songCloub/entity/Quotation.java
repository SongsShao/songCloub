package com.songshao.mybatisPlus.songCloub.entity;

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
@EqualsAndHashCode()
@Accessors(chain = true)
public class Quotation {

    private static final long serialVersionUID = 1L;

    /**
     * 配件编码
     */
    private String pjbm;

    /**
     * 配件名称
     */
    private String pjmc;

    /**
     * 车型
     */
    private String pjcx;

    /**
     * 配件产地
     */
    private String pjcd;

    /**
     * 配件单位
     */
    private String pjdw;

    /**
     * 配件数量
     */
    private Integer pjsl;

    /**
     * 进货单价
     */
    private String jhdj;

    /**
     * 销售单价
     */
    private String xsdj;

    /**
     * 批发单价
     */
    private String pfdj;

    /**
     * 调拨单价
     */
    private String dbdj;

    /**
     * 原厂单价
     */
    private String ycdj;

    /**
     * 外币单价
     */
    private String wbdj;

    /**
     * 坏件数
     */
    private Integer hjs;

    /**
     * 调仓数
     */
    private Integer dcs;

    /**
     * 所在仓库
     */
    private String szck;

    /**
     * 配件货位
     */
    private String pjhw;

    /**
     * 配件规格
     */
    private String pjgg;

    /**
     * 原厂编码
     */
    private String ycbm;

    /**
     * 通用件号
     */
    private String tyjh;

    /**
     * 通用车型
     */
    private String tycx;

    /**
     * 配件条型码
     */
    private String pjtxm;

    /**
     * 配件上限
     */
    private Integer pjsx;

    /**
     * 配件下限
     */
    private Integer pjxx;

    /**
     * 配件备注
     */
    private String pjbz;

    /**
     * 预留字段1
     */
    private String str1;

    /**
     * 预留字段2
     */
    private String str2;

    /**
     * 预留字段3
     */
    private String str3;

    /**
     * 添加用户id
     */
    private String userid;


}
