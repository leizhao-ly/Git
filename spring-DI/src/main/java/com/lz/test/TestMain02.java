package com.lz.test;

import com.lz.controller.HelloController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LY
 */
public class TestMain02 {
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        HelloController helloController=(HelloController)factory.getBean("helloController");
//        System.out.println(helloController+"对象已经被创建了");
//        helloController.text();
        HelloController helloController1=(HelloController)factory.getBean("helloController");
        helloController1.text();
    }
}
