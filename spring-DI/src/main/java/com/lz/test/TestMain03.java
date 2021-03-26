package com.lz.test;

import com.lz.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LY
 * 这个方法用来测试 使用命名空间进行赋值
 */
public class TestMain03 {
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person=(Person)factory.getBean("person2");
        Person person3=(Person)factory.getBean("person3");
        System.out.println(person3);
    }
}
