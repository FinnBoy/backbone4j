package com.awaken.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/login/signin")
    public String signIn() {

        LOG.info("~~~~~~~ signIn ~~~~~~~");
        return "redirect:/home";
    }

    @RequestMapping("/login/signout")
    public String signOut() {

        LOG.info("~~~~~~~ signOut ~~~~~~~");
        return "";
    }

    @RequestMapping("/login/signup")
    public String signUp() {

        LOG.info("~~~~~~~ signUp ~~~~~~~");
        return "";
    }
}
