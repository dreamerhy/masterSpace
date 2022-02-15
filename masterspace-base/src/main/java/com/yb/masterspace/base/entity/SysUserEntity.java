package com.yb.masterspace.base.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 模块：
 * 功能：
 *
 * @author Fanhb
 * 2022/2/14 9:35
 * -
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysUserEntity {

    private String id;
    private String userName;
    private String password;
    private String sex;
    private long age;

}
