package com.zqq.s2sh.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zqq.s2sh.domain.User;
import com.zqq.s2sh.service.IUserService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zqq
 * @Date 2019/9/27  11:11
 */
@ParentPackage("json-default")
@Namespace("/user")
@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    @Resource(name = "userService")
    private IUserService userService;
    private List<User> users;


    /**
     * 用户注册
     */
    @Action(value = "register",results = {
            @Result(name = "success",type = "redirect",location = "/s2sh.jsp")
    })
    public String register() {
        userService.saveUser(user);
        return SUCCESS;
    }

    /**
     * 查询所有用户
     */
    @Action(value = "findAllUser",results = {
            @Result(name = "users",type = "json",params = {"root","users"})})
    public String findAllUser() {
        users = userService.findAllUser();
        return "users";
    }

    @Override
    public User getModel() {
        return user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}