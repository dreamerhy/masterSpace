package com.yb.masterspace.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 模块：
 * 功能：
 *
 * @author Fanhb
 * 2022/02/11 10:45
 * -
 **/

@Target(value = {ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface SpecialCharacterAnnotation {

    //常用正则验证
    RegexType regexType() default RegexType.NONE;

}
