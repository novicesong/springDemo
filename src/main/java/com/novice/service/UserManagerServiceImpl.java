package com.novice.service;

import com.novice.bean.User;
import com.novice.dao.user.UserDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by novice on 15/9/24.
 */
@Service
public class UserManagerServiceImpl implements UserManagerService {

    private static Log log = LogFactory.getLog(UserManagerService.class);

    @Autowired
    private UserDao userDao;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public User getUserByName(String userName) {
        return userDao.getUserByName(userName);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public User getUserByNameAndPwd(String userName, String pwd) {
        return userDao.getUserByNameAndPwd(userName, pwd);
    }
}
