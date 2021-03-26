package com.lz.service;

import com.lz.dao.HelloDao;

/**
 * @author LY
 */
public class HelloService {

    private HelloDao helloDao;

    public HelloService(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

    public HelloService() {
    }

    public void setHelloDao(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

    public void text(){
        System.out.println("这个方法被controller 调用了");
        helloDao.selectOne();
    }
}
