package com.novice.dao.user;

import com.novice.bean.User;
import com.novice.dao.BaseHibernateDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * Created by novice on 15/9/24.
 */
@Repository
public class UserDaoImpl extends BaseHibernateDaoImpl implements UserDao {

    /**
     * 这样的写法存在SQL注入的风险。只是测试代码
     * @param userName
     * @return User
     */
    public User getUserByName(String userName) {

        String hql = "from User user where user.userName =" + userName;

        return (User)this.findSingle(hql);
    }

    public User getUserByNameAndPwd(String userName, String pwd) {

        String hql = "from User user where user.userName =" + userName + " and user.pwd =" + pwd;

        return (User)this.findSingle(hql);
    }
}
