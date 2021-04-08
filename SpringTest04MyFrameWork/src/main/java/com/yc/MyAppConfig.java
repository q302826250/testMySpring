package com.yc;

import com.yc.springframework.stereotype.MyComponentScan;
import com.yc.springframework.stereotype.MyConfiguration;

/**
 * @author 涛大爷的笔记本
 * @Auther: zhangjuntao
 * @Date: 2021/4/5 - 04 - 05 - 11:58
 * @Description :com.yc.bean
 * @Version: 1.0
 */
@MyConfiguration
@MyComponentScan(basePackages = {"com.yc.dao","com.yc.biz"})
public class MyAppConfig {
   /* @MyBean
    public Helloworld hw(){
        //method.invoke(MyappCOnfig对象 ,xxx)
        return  new Helloworld();
    }@MyBean
    public Helloworld hw2(){
        //method.invoke(MyappCOnfig对象 ,xxx)
        return  new Helloworld();
    }*/


}
