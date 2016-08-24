package com.zhong.note2.dao;

import com.zhong.note2.model.User;

/**
 * Created by Aquarius on 2016/8/15.
 */
public interface IUserDao {
    User checkUserAndPasswd(String account,String password);
    void save(User user);
    User getById(int id);
}
