package com.zhong.note2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zhong.note2.model.User;

/**
 * Created by Aquarius on 2016/8/22.
 */
public class ExectionTest extends ActionSupport implements ModelDriven<User>{
    private User user;
    @Override
    public String execute() throws Exception {



        return super.execute();
    }


    @Override
    public User getModel() {

        return null == user?user = new User():user;
    }
}
