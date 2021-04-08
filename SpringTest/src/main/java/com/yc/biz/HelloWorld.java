package com.yc.biz;


import org.springframework.stereotype.Component;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/4 - 04 - 04 - 15:26
 * @Description :com.yc.biz
 * @Version: 1.0
 */
@Component//只要加了这个注解，则这个类可以被spring容器托管
public class HelloWorld {
    public  HelloWorld(){
        System.out.println("helloworld 无参构造函数");
    }
    public  void hello(){
        System.out.println("hello world");
    }
}
