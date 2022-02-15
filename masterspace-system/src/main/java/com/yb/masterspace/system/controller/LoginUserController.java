package com.yb.masterspace.system.controller;

import com.yb.masterspace.base.dto.SysUserInfoDto;
import com.yb.masterspace.base.entity.SysUserEntity;
import com.yb.masterspace.common.ApiResponse;
import com.yb.masterspace.common.constant.SystemConstUrl;
import com.yb.masterspace.system.service.LoginUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模块：
 * 功能：
 *
 * @author Fanhb
 * 2022/2/11 15:08
 * -
 **/

@Slf4j
@Api(description = "用户")
@RestController
public class LoginUserController {

    @Autowired
    LoginUserService loginUserService;

    /**
     * 获取登录用户信息
     *
     * @return ApiResponse<SysUserInfoDto>
     */
    @ApiOperation("获取登录用户信息")
    @PostMapping(SystemConstUrl.SYS_LOGIN_USER_INFO)
    public ApiResponse<SysUserInfoDto> getUserInfo(@RequestBody SysUserEntity sysUserEntity){
        return ApiResponse.data(loginUserService.getUserInfo(sysUserEntity));
    }

}
