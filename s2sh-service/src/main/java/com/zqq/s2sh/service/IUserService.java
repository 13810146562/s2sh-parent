package com.zqq.s2sh.service;

import com.zqq.s2sh.domain.User;

import java.util.List;

/**
 * @Author zqq
 * @Date 2019/9/26  16:09
 */
public interface IUserService {
    /**
     * 保存用户
     */
    public void saveUser(User user);

    /**
     * 查询所有用户
     * @return
     */
    public List<User> findAllUser();
}
