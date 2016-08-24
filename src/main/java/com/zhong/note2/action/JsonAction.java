package com.zhong.note2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zhong.note2.model.User;
import com.zhong.note2.service.IUserService;
import org.apache.struts2.convention.StringTools;
import org.apache.struts2.convention.annotation.*;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aquarius on 2016/8/21.
 */
@ParentPackage("json-default")
@Namespace("/json")
@InterceptorRef("paramsPrepareParamsStack")
public class JsonAction extends ActionSupport implements ModelDriven<User> {
    private User user;

    @Resource
    private IUserService iUserService;

    private Map<String,Object> jasonMap = new HashMap<String,Object>();

    @Action(value = "testjson",results = {
        @Result(name = "success",type = "json")
    })
    public String execute() throws Exception {

        user =  iUserService.getById(user.getId());
        jasonMap.put("user",user);
        return SUCCESS;
    }

    public User getModel() {
        return null == user ? user = new User(): user ;
    }

    public Map<String, Object> getJasonMap() {
        return jasonMap;
    }

    public void setJasonMap(Map<String, Object> jasonMap) {
        this.jasonMap = jasonMap;
    }
}
