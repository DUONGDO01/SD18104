package com.example.sd18104.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("account")
public class LoginCtroller {
    @GetMapping("login")
    public String getlogin() {
        return "login";
    }

    @PostMapping("login")
    public String login(
            @RequestParam("username") String user,
            @RequestParam("password") String pass

    ) {
        System.out.println("Tài Khoản :" + user + "Mật Khẩu : " + pass);

        System.out.println("Tự hủy");
        return "login";
    }
}
