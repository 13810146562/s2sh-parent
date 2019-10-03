package com.zqq.s2sh.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author zqq
 * @Date 2019/9/26  14:50
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
   @Id
   @Column(name = "userid")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
