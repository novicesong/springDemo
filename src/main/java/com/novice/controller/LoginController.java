package com.novice.controller;

import com.novice.bean.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

    private static Log log  = LogFactory.getLog(LoginController.class);

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request,  ModelMap model){

        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");

        return "index";
    }

}
