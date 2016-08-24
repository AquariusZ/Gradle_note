package com.zhong.note2.service;

import com.zhong.note2.model.User;

/**
 * Created by Aquarius on 2016/8/16.
 */
public interface IUserService {
     User checkUserAndPasswd(String account, String password);
     void save(User user);
     User getById(int id);
}
