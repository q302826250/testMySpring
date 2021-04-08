package com.yc.springframework.stereotype;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/5 - 04 - 05 - 12:00
 * @Description :com.yc.springframework.stereotype
 * @Version: 1.0
 */
@Documented
@Retention (RUNTIME)
@Target(METHOD)
public @interface MyPreDestroy {
}
