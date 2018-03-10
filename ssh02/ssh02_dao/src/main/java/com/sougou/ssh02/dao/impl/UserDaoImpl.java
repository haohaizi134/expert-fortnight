package com.sougou.ssh02.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.sougou.ssh02.domain.User;
import com.sougou.ssh02.dao.UserDao;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 下午7:12:41 <br/>       
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    public User test(Integer id) { 
        return getHibernateTemplate().get(User.class, id);
    }
}
  
