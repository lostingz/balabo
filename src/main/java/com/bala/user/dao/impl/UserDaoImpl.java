/**
 * lostingz
 * Created on 2016年7月7日
 */
package com.bala.user.dao.impl;

import java.util.List;
import java.util.UUID;

import org.apache.commons.codec.digest.Sha2Crypt;
import org.springframework.stereotype.Repository;

import com.bala.common.hibernate.dao.BaseHibernateDao;
import com.bala.user.dao.UserDao;
import com.bala.user.model.User;
import com.google.common.base.Preconditions;

/**
 * @author lostingz<a href="mailto:18710833123@163.com">lostingz</a>
 * @version $Id$
 */
@Repository("userDao")
public class UserDaoImpl extends BaseHibernateDao<User> implements UserDao {
    
    @Override
    public User getUserByAccount(String account) {
        List<User> l = findByHql("from User where account=?", account);
        return l.isEmpty() ? null : l.get(0);
    }

    @Override
    public void createUser(User u) {
        Preconditions.checkArgument(getUserByAccount(u.getAccount())==null,"用户名已经存在");
        u.setSalt(UUID.randomUUID().toString());
        u.setPassword(Sha2Crypt.sha512Crypt(u.getPassword().getBytes(),u.getSalt()));
        save(u);
    }

    @Override
    public User getUserById(String uid) {
        List<User> l = findByHql("from User where id=?", uid);
        return l.isEmpty() ? null : l.get(0);
    }

    @Override
    public void updateUser(User u) {
        update(u);
    }

    @Override
    public void saveOrUpdateUser(User u) {
        saveOrUpdate(u);
    }

    @Override
    public List<User> getList() {
        List<User> l = findByHql("from User where 1=1",null);
        return l;
    }
}
