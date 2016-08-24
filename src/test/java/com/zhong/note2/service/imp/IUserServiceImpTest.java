package com.zhong.note2.service.imp;

import com.zhong.note2.basetest.BaseTest;
import com.zhong.note2.model.User;
import com.zhong.note2.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by Aquarius on 2016/8/16.
 */
public class IUserServiceImpTest extends BaseTest {
    @Autowired
    private IUserService iUserService;
    @Test
    public void checkUserAndPasswd() throws Exception {
      User user = iUserService.checkUserAndPasswd("xiaoming","123456");
    }

    @Test
    public void save() throws Exception {
//        for (int i = 0;i < 10 ;i++){
//            User user = new User();
//            user.setType("学生狗");
//            user.setName("paopao"+i);
//            user.setAccount("泡泡"+i);
//            user.setPasswd("123456");
//            iUserService.save(user);
//        }
    }

}