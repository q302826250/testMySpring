package com.yc.dao;

import java.util.Random;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/4 - 04 - 04 - 14:50
 * @Description :com.yc.dao
 * @Version: 1.0
 */
public class StudentDaoJpalmpl implements StudentDao{
    @Override
    public int add(String name) {
        System.out.println("jpa添加学生"+name);
        Random r = new Random();
        return r.nextInt();
    }


    @Override
    public void update(String name) {
        System.out.println("jap更新学生"+name);
    }
}
