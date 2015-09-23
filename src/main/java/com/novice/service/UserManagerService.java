package com.novice.service;

import com.novice.bean.User;

/**
 * Created by novice on 15/9/24.
 */
public interface UserManagerService {

    User getUserByName(String userName);

    User getUserByNameAndPwd(String userName,String pwd);
}
