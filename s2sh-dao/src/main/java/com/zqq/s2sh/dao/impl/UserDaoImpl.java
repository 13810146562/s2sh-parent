package com.zqq.s2sh.dao.impl;

import com.zqq.s2sh.dao.IUserDao;
import com.zqq.s2sh.domain.User;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zqq
 * @Date 2019/9/26  14:55
 */
@Repository("userDao")
public class UserDaoImpl implements IUserDao {
    @Resource(name="hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    @Override
    public void saveUser(User user) {
       hibernateTemplate.save(user);
    }

    @Override
    public List<User> findAllUser() {
        return (List<User>) hibernateTemplate.find("from User");
    }
}
