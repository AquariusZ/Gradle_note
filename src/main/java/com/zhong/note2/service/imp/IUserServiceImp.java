package com.zhong.note2.service.imp;

import com.zhong.note2.dao.IUserDao;
import com.zhong.note2.model.User;
import com.zhong.note2.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Aquarius on 2016/8/16.
 */
@Service("iUserService")
@Transactional
public class IUserServiceImp implements IUserService {
    @Autowired
    private IUserDao iUserDao;

    public User checkUserAndPasswd(String account, String password) {
        return iUserDao.checkUserAndPasswd(account,password);

    }

    public void save(User user) {
        iUserDao.save(user);
    }

    public User getById(int id) {
        return iUserDao.getById(id);
    }
}
