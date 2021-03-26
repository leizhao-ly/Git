package com.lz.test;

import com.lz.bean.Person;
import com.lz.bean.Room;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LY
 */
public class TestMain01 {

    public static void main(String[] args) {
        //演示Spring的DI
        BeanFactory factory=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person=(Person)factory.getBean("person");
        System.out.println(person);
        //System.out.println(person.getName().length());
        //相当于Person person=new Person()
        //之后需要调用setter方法赋值
        //也可以通过有参构造方法赋值

        //getBean 的底层原理
        // 1.读取.xml文件
        // 2.通过反射创建对象
        // 3. 得到所有的私有属性，在找set方法进行赋值
        System.out.println(person+"配置property可以为属性赋值");


        Room room=(Room)factory.getBean("room");
        System.out.println(room+"看看computer对象是否被加载了");


        //用来检验对象实在内部进行创建的
        Room room1=(Room)factory.getBean("room1");
        System.out.println(room1);

    }
}
