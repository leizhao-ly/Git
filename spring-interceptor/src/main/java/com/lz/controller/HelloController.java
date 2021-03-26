package com.lz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author LY
 */
@Controller
@RequestMapping(produces = "application/json;charset=utf-8")
public class HelloController {

    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        System.out.println("执行了");
        return "登录成功";
    }

}
