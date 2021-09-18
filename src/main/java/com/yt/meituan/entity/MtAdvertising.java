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
@TableName("mt_advertising")
@ApiModel(value="MtAdvertising对象", description="")
public class MtAdvertising implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "唯一标识")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "广告名")
    private String adverName;

    @ApiModelProperty(value = "广告后缀")
    private String adverSuffix;

    @ApiModelProperty(value = "广告大小")
    private Long adverSize;

    @ApiModelProperty(value = "广告地址")
    private String adverPath;


}
