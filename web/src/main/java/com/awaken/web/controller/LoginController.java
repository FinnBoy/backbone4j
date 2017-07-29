package com.awaken.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login/signin")
    public String signIn() {

        return "";
    }

    @RequestMapping("/login/signout")
    public String signOut() {

        return "";
    }

    @RequestMapping("/login/signup")
    public String signUp() {

        return "";
    }
}
