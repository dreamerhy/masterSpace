package com.yb.masterspace.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yb.masterspace.base.dto.SysUserInfoDto;
import com.yb.masterspace.base.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 模块：
 * 功能：
 *
 * @author Fanhb
 * 2022/2/14 9:48
 * -
 **/
@Mapper
public interface LoginUserDao extends BaseMapper<SysUserEntity> {

    /**
     * 获取用户信息
     * @param userid 用户id
     * @return 结果
     */
    SysUserInfoDto getUserInfo(String userid);
}
