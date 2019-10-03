package com.zqq.s2sh.service.impl;

import com.zqq.s2sh.dao.IUserDao;
import com.zqq.s2sh.domain.User;
import com.zqq.s2sh.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zqq
 * @Date 2019/9/26  16:10
 */
@Service("userService")
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements IUserService {
    @Resource(name = "userDao")
    private IUserDao userDao ;

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
