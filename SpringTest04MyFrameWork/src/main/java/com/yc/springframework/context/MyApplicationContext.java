package com.yc.springframework.context;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/5 - 04 - 05 - 14:11
 * @Description :com.yc.springframework.context
 * @Version: 1.0
 */
public interface MyApplicationContext {
    public Object getBean(String id);
}
