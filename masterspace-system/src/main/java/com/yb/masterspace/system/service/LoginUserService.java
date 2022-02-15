package com.yb.masterspace.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.masterspace.base.dto.SysUserInfoDto;
import com.yb.masterspace.base.entity.SysUserEntity;

/**
 * 模块：
 * 功能：
 *
 * @author Fanhb
 * 2022/2/14 9:43
 * -
 **/

public interface LoginUserService extends IService<SysUserEntity> {

    /**
     * 获取用户信息
     * @param sysUserEntity 参数
     * @return 结果
     */
    SysUserInfoDto getUserInfo(SysUserEntity sysUserEntity);
}
