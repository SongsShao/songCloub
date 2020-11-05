package com.songshao.mybatisPlus.shop.entity;

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
public class Userinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编码
     */
    private Integer uid;

    /**
     * 用户wei编码
     */
    @TableField("weiId")
    private String weiId;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 秘钥
     */
    private String pwd;

    /**
     * 邮箱
     */
    @TableField("Email")
    private String Email;

    /**
     * 用户状态0冻结1正常2黑名单3逾期用户99其他
     */
    private Integer state;


}
