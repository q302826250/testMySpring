package com.yc.biz;

import com.yc.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/4 - 04 - 04 - 14:53
 * @Description :com.yc.biz
 * @Version: 1.0
 */
@Service // biz业务层用这个
public class StudentBizImpl {
    private StudentDao studentDao;

    public StudentBizImpl(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public StudentBizImpl(){}

    //@Inject //javax中的依赖注入(比如这里有StudentDaoJpaImpl 和 StudentDaoMybatisImpl对象)
    //因为有多个对象可以注入，所以这里必须用@Named（"studentDaoJpaImpl"），如只有一个对象，则不需要写
   // @Autowired //org.springframework

    @Autowired
//    @Resource(name="studentDaoJpaImpl")
    @Qualifier("studentDaoJpalmpl")
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
