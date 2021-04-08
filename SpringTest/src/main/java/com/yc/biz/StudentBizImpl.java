package com.yc.biz;

import com.yc.dao.StudentDao;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/4 - 04 - 04 - 14:53
 * @Description :com.yc.biz
 * @Version: 1.0
 */
@Component//只要加了这个注解，则这个类可以被spring容器托管
public class StudentBizImpl {
    private StudentDao studentDao;

    public StudentBizImpl(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public StudentBizImpl(){}

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void setDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int add(String name) {
        System.out.println("================业务层");
        System.out.println("用户名是否重名");
        int result = studentDao.add(name);
            return result;
    }


    public void update(String name) {
        System.out.println("================业务层");
        System.out.println("用户名是否重名");
       studentDao.update(name);
        System.out.println("================业务操作结束");

    }


}
