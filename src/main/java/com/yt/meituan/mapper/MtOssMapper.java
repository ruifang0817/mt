package com.yt.meituan.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yt.meituan.common.exception.GlobalException;
import com.yt.meituan.common.utils.OssUtil;
import com.yt.meituan.common.utils.Result;
import com.yt.meituan.entity.MtOss;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * <p>
 * 文件上传 Mapper 接口
 * </p>
 *
 * @author grf
 * @since 2021-09-18
 */
@Mapper
public interface MtOssMapper extends BaseMapper<MtOss> {


}
