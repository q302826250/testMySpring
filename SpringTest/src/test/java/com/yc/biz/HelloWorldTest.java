package com.yc.biz;

import com.yc.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/4 - 04 - 04 - 15:42
 * @Description :com.yc.biz
 * @Version: 1.0
 */
public class HelloWorldTest {

    private ApplicationContext ac;//spring  容器

    @Before
    public void setUp(){
        ac = new AnnotationConfigApplicationContext(AppConfig.class);
        //AnnotationConfigApplicationContext 基于注释的配置容器类
        //读取 AppConfig.class ->vasePackage = "com.yc " ->得到要扫描的路径
        //要检查这些包上是否有@component注解 如有，则实例化
        //存到一个Map<String,Object> ===ac
    }

    @Test
    public  void testHello(){
        HelloWorld hw = (HelloWorld) ac.getBean("helloWorld");
        hw.hello();

        HelloWorld hw2 = (HelloWorld) ac.getBean("helloWorld");
        hw2.hello();
        //spring 容器是单例模型
    }
}