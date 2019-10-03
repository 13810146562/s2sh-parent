package com.zqq.s2sh.test;

import com.zqq.s2sh.dao.impl.UserDaoImpl;
import com.zqq.s2sh.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 测试dao模块配置情况
 * @Author zqq
 * @Date 2019/9/26  15:22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.dao.xml")
public class DaoTest {
    @Resource(name="userDao")
    private UserDaoImpl userDao;
    @Test
    public void test(){
        System.out.println(userDao);
    }
}
