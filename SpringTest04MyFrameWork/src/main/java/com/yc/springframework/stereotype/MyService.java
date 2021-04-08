package com.yc.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/5 - 04 - 05 - 12:00
 * @Description :com.yc.springframework.stereotype
 * @Version: 1.0
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@MyComponent
public @interface MyService {
    String value() default "";
}
