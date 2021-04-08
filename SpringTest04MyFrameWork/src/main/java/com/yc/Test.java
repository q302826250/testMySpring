package com.yc;

import com.yc.biz.StudentBizImpl;
import com.yc.springframework.context.MyAnnotationConfigApplicationContext;
import com.yc.springframework.context.MyApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/5 - 04 - 05 - 11:58
 * @Description :com.yc.bean
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, ClassNotFoundException {
        MyApplicationContext ac = new MyAnnotationConfigApplicationContext(MyAppConfig.class);
        StudentBizImpl hw = (StudentBizImpl) ac.getBean("studentBizImpl");
        hw.add("abc");
    }
}
