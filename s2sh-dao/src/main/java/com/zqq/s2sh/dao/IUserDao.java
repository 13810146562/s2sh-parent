package com.zqq.s2sh.dao;

import com.zqq.s2sh.domain.User;

import java.util.List;

/**
 * UserDao接口
 * @Author zqq
 * @Date 2019/9/26  14:49
 */
public interface IUserDao {
    /**
     * 保存用户
     * @param user
     */
    public void saveUser(User user);

    /**
     * 查询所有用户
     * @return
     */
    public List<User> findAllUser();
}
