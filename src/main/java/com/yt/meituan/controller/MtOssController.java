package com.yt.meituan.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yt.meituan.common.exception.GlobalException;
import com.yt.meituan.common.utils.OssUtil;
import com.yt.meituan.common.utils.Result;
import com.yt.meituan.entity.MtOss;
import com.yt.meituan.service.MtOssService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * <p>
 * 文件上传 前端控制器
 * </p>
 *
 * @author grf
 * @since 2021-09-18
 */
@RestController
@RequestMapping("/mt/mt-oss")
@Api(tags = "文件上传")
public class MtOssController {


    @Autowired
    private OssUtil ossUtil;
    @Autowired
    private MtOssService backOssService;

    @ApiOperation(value = "上传文件")
    @PostMapping("/upload")
    public Result upload(@ApiParam MultipartFile file) {
        // 用于保存文件 url
        String url = null;
        // 用于保存文件信息
        MtOss backOss = new MtOss();
        try {
            // 获取文件上传路径
            url = ossUtil.uploadSuffix(file.getInputStream(), "mt", file.getOriginalFilename());
            // 保存文件路径到数据库中
            backOss.setFileName(file.getOriginalFilename());
            backOss.setOssName(url);
            backOss.setFileUrl(ossUtil.getUrl(url));
            backOssService.save(backOss);
        } catch (IOException e) {
            throw new GlobalException("文件上传失败");
        }
        return Result.ok().message("文件上传成功").data("file", backOss);
    }

    @ApiOperation(value = "获取所有文件信息")
    @GetMapping("/getAll")
    public Result getAll() {
        return Result.ok().data("file", backOssService.list());
    }

    @ApiOperation(value = "保存并获取文件 url")
    @PostMapping("/saveUrl")
    public Result saveUrl(@RequestParam String key, @RequestParam String fileName) {
        MtOss backOss = new MtOss();
        backOss.setOssName(key);
        backOss.setFileName(fileName);
        backOss.setFileUrl(ossUtil.getUrl(key));
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("oss_name", key);
        backOssService.saveOrUpdate(backOss, queryWrapper);
        return Result.ok().data("file", backOssService.getOne(queryWrapper));
    }

    @ApiOperation(value = "删除文件")
    @DeleteMapping("/delete/object")
    public Result deleteObject(@RequestParam String key) {
        ossUtil.deleteObject(key);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("oss_name", key);
        backOssService.remove(queryWrapper);
        return Result.ok();
    }
}

