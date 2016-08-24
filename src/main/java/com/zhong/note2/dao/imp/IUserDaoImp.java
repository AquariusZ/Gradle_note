package com.zhong.note2.dao.imp;

import com.zhong.note2.dao.IUserDao;
import com.zhong.note2.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by Aquarius on 2016/8/15.
 */
@Repository("iUserDao")
public class IUserDaoImp extends IBaseDaoImp implements IUserDao{

    public User checkUserAndPasswd(String account, String password) {
        String sql = "from User u where u.account = :account and u.passwd =:passwd";
        List<User> users =this.getCurrenSession().createQuery(sql).setParameter("account",account)
                .setParameter("passwd",password).list();
        if (null != users && users.size() > 0)
            return users.get(0);
        return null;
    }

    public void save(User user) {
        super.saveEntity(user);
    }

    public User getById(int id) {
        return super.getEntityById(User.class,id);
    }
}
