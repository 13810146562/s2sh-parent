package com.zqq.s2sh.service.test;

import com.zqq.s2sh.domain.User;
import com.zqq.s2sh.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author zqq
 * @Date 2019/9/26  16:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.service.xml")
public class ServiceTest {
    @Autowired
    private IUserService userService;
    @Test
    public void test(){
        User user = new User();
        user.setUserName("zqqfind");
        user.setPassword("1234");
        userService.saveUser(user);
        List<User> users = userService.findAllUser();
        users.forEach(System.out::println);
    }
}
