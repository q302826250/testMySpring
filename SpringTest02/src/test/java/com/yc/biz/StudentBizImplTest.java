package com.yc.biz;

import com.yc.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/4 - 04 - 04 - 19:02
 * @Description :com.yc.biz
 * @Version: 1.0
 */
public class StudentBizImplTest {

    //容器
    ApplicationContext ac;
    private StudentBizImpl studentBiz;

    @Before
    public void setUp() throws Exception {
        ac=new AnnotationConfigApplicationContext(AppConfig.class);
        studentBiz = (StudentBizImpl) ac.getBean("studentBizImpl");

    }

    @Test
    public void add() {
        studentBiz.add("李四");
    }

    @Test
    public void update() {
        studentBiz.update("李四");
    }
}