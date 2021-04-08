package com.yc.biz;

import com.yc.AppConfig;
import com.yc.dao.StudentDao;
import com.yc.dao.StudentDaoMybatisImpl;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentBizImplTest extends TestCase {

    private ApplicationContext ac;

    @Override
    @Before
    public void setUp() throws Exception {
        //AnnotationConfigApplicationContext    基于注解的配置容器类
        ac=new AnnotationConfigApplicationContext(AppConfig.class);
        //读取  appconfig.class   ->  basePackage ="com.yc"   ->  得到要扫描的路径
        //要检查这些包中的上是否有@Component注解      如有,,,则实例化
        //存到一个Map<String,Object> ====ac
    }

    @Test
    public void testDao() {
        StudentDao dao=ac.getBean(StudentDaoMybatisImpl.class);
        StudentBizImpl biz=ac.getBean(StudentBizImpl.class);
        biz.setDao(dao);
        dao.add("张三");
        dao.update("李四");
    }
}