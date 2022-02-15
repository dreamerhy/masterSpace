package com.yb.masterspace.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.masterspace.base.dto.SysUserInfoDto;
import com.yb.masterspace.base.entity.SysUserEntity;
import com.yb.masterspace.system.dao.LoginUserDao;
import com.yb.masterspace.system.service.LoginUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 模块：
 * 功能：
 *
 * @author Fanhb
 * 2022/2/14 9:47
 * -
 **/

@Slf4j
@Service
public class LoginUserServiceImpl extends ServiceImpl<LoginUserDao, SysUserEntity> implements LoginUserService {

    @Resource
    LoginUserDao loginUserDao;

    /**
     * 获取用户信息
     * @param sysUserEntity 参数
     * @return 结果
     */
    @Override
    public SysUserInfoDto getUserInfo(SysUserEntity sysUserEntity) {
        try {

            return loginUserDao.getUserInfo(sysUserEntity.getId());
        } catch (Exception e) {
            log.error("LoginUserServiceImpl.getUserInfo 获取用户信息异常：" + e.getMessage());
            return null;
        }
    }

}
