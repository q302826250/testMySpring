package com.yc.dao;


import com.yc.biz.StudentBizImpl;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/4 - 04 - 04 - 14:21
 * @Description :com.yc.dao
 * @Version: 1.0
 */
public class StudentDaoTest extends TestCase {

    private StudentDao studentDao;
    private StudentBizImpl studentBizImpl;
    @Before
    public void setUp() throws Exception {
        studentDao = new StudentDaoJpalmpl();
         studentBizImpl = new StudentBizImpl();

        studentBizImpl.setStudentDao(studentDao);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() { studentDao.add("张三");
    }

    @Test
    public void update() {
        studentDao.update("李四");
    }
    @Test
    public void testBizAdd(){
        studentBizImpl.add("张三");
    }
}