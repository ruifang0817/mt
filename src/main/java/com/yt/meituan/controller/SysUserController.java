package com.yt.meituan.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yt.meituan.common.utils.Result;
import com.yt.meituan.entity.SysUser;
import com.yt.meituan.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 系统用户表 前端控制器
 * </p>
 *
 * @author grf
 * @since 2021-09-18
 */
@RestController
@RequestMapping("/mt/sys-user")
@Api(tags = "系统用户表")
public class SysUserController {
    @Autowired
    private SysUserService userService;

    @ApiOperation(value = "获取所有用户信息")
    @GetMapping("/getListUser")
    public Result testGetListUser() {
        return Result.ok().data("user", userService.list());
    }

    @ApiOperation(value = "添加用户信息")
    @PostMapping("/add")
    public Result testMyBatisPlusAutoFill(@RequestBody SysUser user) {
        if (userService.save(user)) {
            return Result.ok().message("数据添加成功");
        }
        return Result.error().message("数据添加失败");
    }

    @ApiOperation(value = "分页")
    @GetMapping("/testMyBatisPlus/page/{current}/{size}")
    public Result testPage(@PathVariable("current") Long current, @PathVariable("size") Long size) {
        Page<SysUser> page = new Page(current, size);
        return Result.ok().data("page", userService.page(page, null));
    }
}

