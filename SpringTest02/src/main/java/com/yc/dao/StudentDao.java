package com.yc.dao;

import org.springframework.stereotype.Repository;

/**
 * @Auther: zhangjuntao
 * @Date: 2021/4/4 - 04 - 04 - 14:14
 * @Description :com.yc.dao
 * @Version: 1.0
 */
@Repository
public interface StudentDao {
    public int add(String name);

    public void update(String name);

}
