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
@TableName("mt_variety")
@ApiModel(value="MtVariety对象", description="")
public class MtVariety implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "唯一标识")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "饭店id")
    private Long restId;

    @ApiModelProperty(value = "字典id")
    private Long dictionariesId;

    @ApiModelProperty(value = "菜品名")
    private String variName;

    @ApiModelProperty(value = "菜品标签")
    private String variLabel;

    @ApiModelProperty(value = "月售")
    private Long variSell;

    @ApiModelProperty(value = "点赞数")
    private Long variGive;

    @ApiModelProperty(value = "价格")
    private Long variPrice;


}
