package com.yt.meituan.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author grf
 * @since 2021-09-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mt_attachment")
@ApiModel(value="MtAttachment对象", description="")
public class MtAttachment implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "唯一标识")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "附件类型:                                                  0:饭店封面 1:广告封面 2:菜品封面")
    private Long attachType;

    @ApiModelProperty(value = "附件名称")
    private byte[] attachName;

    @ApiModelProperty(value = "附件后缀")
    private String attachSuffix;

    @ApiModelProperty(value = "附件大小")
    private Long attachSize;

    @ApiModelProperty(value = "附件地址")
    private String attachPath;


}
