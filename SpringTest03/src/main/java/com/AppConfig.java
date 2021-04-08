package com;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Random;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/4 - 04 - 04 - 15:36
 * @Description :com.yc
 * @Version: 1.0
 */
@Configurable//表示当前的类是一个配置类
@ComponentScan(basePackages = "com")//将来要托管的bean要扫描的包以及子包
public class AppConfig {//java容器的配置
    @Bean //beanid:"r"
    public Random r(){
        return new Random();
    }
    //以下这些不推荐
   /* @Bean
    public Person p1(){
            return new Person("");
    }
    @Bean
    public Person p2(){
            return new Person("");
    }*/
}
