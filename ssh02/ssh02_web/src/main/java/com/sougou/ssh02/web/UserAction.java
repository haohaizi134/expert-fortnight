package com.sougou.ssh02.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sougou.ssh02.domain.User;
import com.sougou.ssh02.service.UserService;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 下午7:44:54 <br/>       
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
    private UserService userService;
    
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    private User user;
    public User getModel() {
       if(user==null) {
           user = new User();
       }
        return user;
    }
    
    public String test() {
        user = userService.test(user.getId());
        return SUCCESS;
    }
}
  
