package com.zhong.note2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import com.zhong.note2.model.User;
import com.zhong.note2.service.IUserService;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Namespace("/user")
@InterceptorRefs({
    @InterceptorRef(value = "token",params = {"includeMethods","execute"}),
    @InterceptorRef("paramsPrepareParamsStack")
})
public class LoginAction extends ActionSupport implements ModelDriven<User>,ServletRequestAware,SessionAware{

    private User user;

    @Resource
    private IUserService iUserService;

    private HttpServletRequest request;

    private Map session;

    @Action(value = "input",results = {
        @Result(name = INPUT,location = "/WEB-INF/jsps/login.jsp")
    })
    public String input(){
        return INPUT;
    }

    @Action(value = "login",results = {
        @Result(name = INPUT,location = "/WEB-INF/jsps/login.jsp"),
//        @Result(name = INPUT,location = "input.action",type = "redirect"),
        @Result(name = SUCCESS,location = "/WEB-INF/jsps/info.jsp")
    })
    @Validations(requiredStrings = {
        @RequiredStringValidator(type = ValidatorType.SIMPLE,fieldName = "account",message = "请输入账号"),
        @RequiredStringValidator(type = ValidatorType.SIMPLE,fieldName = "passwd",message = "请输入密码")
        }
    )
    public String execute() throws Exception {
        user =  iUserService.checkUserAndPasswd(user.getAccount(),user.getPasswd());
        if (null == user){
            return INPUT;
        }
        session.put("user",user);
        request.setAttribute("user",user);
        return SUCCESS;
    }

    public  User getModel()  {
        return null == user ? user = new User():user;
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }


    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
