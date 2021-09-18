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
@TableName("mt_restaurant")
@ApiModel(value="MtRestaurant对象", description="")
public class MtRestaurant implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "唯一标识")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "饭店名")
    private String restName;

    @ApiModelProperty(value = "饭店地址")
    private String restAddress;

    @ApiModelProperty(value = "饭店封面id")
    private Long coverId;

    @ApiModelProperty(value = "饭店背景id")
    private Long backgroudId;

    @ApiModelProperty(value = "评分")
    private Long restGrade;

    @ApiModelProperty(value = "月售")
    private Long restSell;

    @ApiModelProperty(value = "人均消费")
    private Long restPerCapita;

    @ApiModelProperty(value = "饭店标签")
    private String restLabel;

    @ApiModelProperty(value = "字典id")
    private Long dictionariesId;


}
