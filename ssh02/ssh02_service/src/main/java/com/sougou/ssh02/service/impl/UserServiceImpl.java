package com.sougou.ssh02.service.impl;

import com.sougou.ssh02.dao.UserDao;
import com.sougou.ssh02.domain.User;
import com.sougou.ssh02.service.UserService;

/**  
 * ClassName:UserServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 下午7:25:41 <br/>       
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public User test(Integer id) {
        return userDao.test(id);
    }
}
  
