package com.yc.bean;

import com.yc.springframework.stereotype.MyComponent;
import com.yc.springframework.stereotype.MyPostConstruct;
import com.yc.springframework.stereotype.MyPreDestroy;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/5 - 04 - 05 - 11:58
 * @Description :com.yc.bean
 * @Version: 1.0
 */
@MyComponent
public class Helloworld {

    @MyPostConstruct
    public void setup(){
        System.out.println("MyPostConstruct方法");
    }
    @MyPreDestroy
    public void destroy(){
        System.out.println("MyPreDestroy");
    }

    public Helloworld(){
        System.out.println("Helloworld无参构造函数");
    }

    public void show(){
        System.out.println("show方法");
    }
}
