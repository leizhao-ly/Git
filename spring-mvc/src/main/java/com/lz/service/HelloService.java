package com.lz.service;

import com.lz.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LY
 */
@Service
public class HelloService {

    @Autowired
    private HelloDao helloDao;
    public void login(){
        helloDao.selectOne();
        System.out.println("helloService正常执行啦");
    }
}
