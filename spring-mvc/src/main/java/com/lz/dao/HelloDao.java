package com.lz.dao;

import com.lz.bean.Person;
import org.springframework.stereotype.Repository;

/**
 * @author LY
 */
@Repository
public class HelloDao {

    public void selectOne(){
        System.out.println("helloDao mvc都被spring自动管理了");
    }
}
