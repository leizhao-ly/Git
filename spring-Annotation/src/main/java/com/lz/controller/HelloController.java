package com.lz.controller;

import com.lz.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author LY
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService service;

    public void hello(){
        System.out.println(service+"不抛出空指针异常就说明对象已经自动装配了");
        service.helloService();
    }
}
