package com.lz.service;

import com.lz.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LY
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void test(){
        System.out.println(userDao);
    }
}
