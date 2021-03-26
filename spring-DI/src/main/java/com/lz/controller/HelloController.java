package com.lz.controller;

import com.lz.dao.HelloDao;
import com.lz.service.HelloService;

/**
 * @author LY
 */
public class HelloController {

    private HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    public HelloController() {
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public void text(){
        System.out.println("controller自己执行了，说明对象已经被创建了 ");
        helloService.text();
    }
}
