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
 * 文件上传
 * </p>
 *
 * @author grf
 * @since 2021-09-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mt_oss")
@ApiModel(value="MtOss对象", description="文件上传")
public class MtOss implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "文件 ID")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value = "URL 地址")
    private String fileUrl;

    @ApiModelProperty(value = "存储在 OSS 中的文件名")
    private String ossName;

    @ApiModelProperty(value = "文件名")
    private String fileName;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;


}
