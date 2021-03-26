package com.lz.service;

import com.lz.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author LY
 */
@Service
@Lazy(false)
public class HelloService {
    @Autowired
    private HelloDao helloDao;

    public void helloService(){
        helloDao.helloDao();
        System.out.println("helloService执行了");
    }
}
