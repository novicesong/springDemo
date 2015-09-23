package com.novice.dao.user;

import com.novice.bean.User;
import com.novice.dao.BaseHibernateDao;

/**
 * Created by novice on 15/9/24.
 */
public interface UserDao extends BaseHibernateDao{

    User getUserByName(String userName);

    User getUserByNameAndPwd(String userName,String pwd);
}
