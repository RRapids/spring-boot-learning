package com.soft1851.springboot.aop.annotation;

import java.lang.annotation.*;

/**
 * @author tf_yuan
 * @description 认证鉴权注解
 * @date 2020/4/13
 */

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthToken {

    /**
     * 访问接口所需要的身份，默认为空，登录即可访问，可以登陆多个
     * @return
     */
    String[] role_name() default "";
}
