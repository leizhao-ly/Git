package com.lz.controller;

import com.lz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author LY
 */
@Controller
@RequestMapping("application/json;charset=utf-8")
public class DeptController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    @ResponseBody
    public String test(){
        userService.test();
        return "测试成功";
    }
}
