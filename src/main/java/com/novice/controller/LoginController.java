package com.novice.controller;

import com.novice.bean.User;
import com.novice.service.UserManagerService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by novice on 15/9/23.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    private static Log log = LogFactory.getLog(LoginController.class);

    @Autowired
    private UserManagerService userManagerService;

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request, ModelMap model) {

        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");

        User user = userManagerService.getUserByNameAndPwd(userName, pwd);
        //TODO

        log.info(userName + "  :  " + pwd);

        return "index";
    }

}
