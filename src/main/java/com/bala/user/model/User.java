/**
 * lostingz
 * Created on 2016年7月7日
 */
package com.bala.user.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author lostingz<a href="mailto:18710833123@163.com">lostingz</a>
 * @version $Id$
 */
@Table(name = "users")
@Entity
public class User implements Serializable{
    private static final long serialVersionUID = 5292834002733528261L;
    @Id
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
    @Column(name = "id",nullable = false)
    private String id;
    @Column(name = "account",nullable = false)
    private String account;
    @Column(name = "password",nullable = false)
    private String password;
    @Column(name = "salt",nullable = false)
    private String salt;
    //头像
    @Column
    private String avatar;
    //电子邮箱
    @Column
    private String email;


    public User() {
        super();
    }

    public User(String account, String password) {
        super();
        this.account = account;
        this.password = password;
        this.salt=String.valueOf(System.currentTimeMillis());
    }

    public User(String id, String account, String password) {
        super();
        this.id = id;
        this.account = account;
        this.password = password;
        this.salt=String.valueOf(System.currentTimeMillis());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
