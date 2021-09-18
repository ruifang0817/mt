package com.yt.meituan.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统用户表
 * </p>
 *
 * @author grf
 * @since 2021-09-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")
@ApiModel(value="SysUser对象", description="系统用户表")
public class SysUser implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "用户 ID")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "用户手机号")
    private String mobile;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "性别， 0 表示女， 1 表示男")
    private Integer sex;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "逻辑删除标志，0 表示未删除， 1 表示删除")
    private Integer deleteFlag;

    @ApiModelProperty(value = "禁用标志， 0 表示未禁用， 1 表示禁用")
    private Integer disabledFlag;

    @ApiModelProperty(value = "微信 openid（拓展字段、用于第三方微信登录）")
    private String wxId;

    @ApiModelProperty(value = "QQ openid（拓展字段、用于第三方 QQ 登录）")
    private String qqId;


}
