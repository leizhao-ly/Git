package com.lz.service;

import com.lz.dao.UserDao;
import com.lz.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LY
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void register(User user){
        userDao.insertOne(user);
        System.out.println(userDao);
    }
}
