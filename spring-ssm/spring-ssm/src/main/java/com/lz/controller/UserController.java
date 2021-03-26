package com.lz.controller;


import com.lz.domain.User;
import com.lz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author LY
 */
@Controller
@RequestMapping(produces = "application/json;charset=utf-8")
public class UserController {
    @Autowired
    public UserService userService;
    @RequestMapping("/register")
    @ResponseBody
    public String register(User user){
        System.out.println(user);
        userService.register(user);
        return "新增成功";
    }
}
