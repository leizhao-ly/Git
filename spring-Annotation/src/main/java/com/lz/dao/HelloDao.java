package com.lz.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author LY
 */
@Repository
public class HelloDao {

    public void helloDao(){
        System.out.println("helloDao执行了");
    }
}
