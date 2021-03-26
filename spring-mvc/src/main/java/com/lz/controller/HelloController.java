package com.lz.controller;

import com.lz.bean.Person;
import com.lz.exception.MyException;
import com.lz.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author LY
 */

@RestController
@RequestMapping(produces = "application/json;charset=utf-8")
public class HelloController {

    @Autowired
    private HelloService service;

    @RequestMapping("/login")
    public String login(Person person, @CookieValue("JSESSIONID") String cookieValue){
        System.out.println(cookieValue);
        System.out.println(person);
        service.login();
        System.out.println("我终于执行啦");
        return "登录成功";
    }

    @RequestMapping("/test")
    @ResponseBody
    public Person test(@RequestBody Person person1){
        System.out.println(person1);
        Person person=new Person("赵依依",18,"女");
        return person;
    }

    @RequestMapping("/doError")
    public  String doError(){
        System.out.println("我执行啦");
        try {
            String str=null;
            str.length();
        }catch (Exception e){
            throw new MyException();
        }
        return "我跳过了异常吗";
    }


}
