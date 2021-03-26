package test;

import bean.Dog;
import bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LY
 */
public class TestMain {

    public static void main(String[] args) {
        //一.自己通过new来构建对象
        Person person = new Person();
        //2.自己给属性赋值
        //a.通过属性对应的set进行赋值
        person.setName("雷昭");
        person.setAge(18);
        person.setSex("男");
        //b.通过带参数的构造方法进行赋值
        new Person("lz", 18, "男");

        //二 通过spring 帮我们创建对象
        //1.需要创建一个spring中用来管理对象的工厂
        BeanFactory factory = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        //2帮我们创建对象 跟工厂创建一个对象
        Person person1 = (Person) factory.getBean("person");
        System.out.println(person1 + "工厂已经帮我创建了一个对象");

        //判断spring 管理对象的方式是否是单例的
        Person person2 = (Person) factory.getBean("person");
        if (person1 == person2) {
            System.out.println("如果能够运行说明对象工厂帮我们创建对象的方式也是单例的");
        }else {
            System.out.println("将scope变成prototype 对象工厂帮我们创建对象变成原型的模式，不在使用单例管理啦");
        }
        Dog dog = (Dog) factory.getBean("dog");
        System.out.println(dog + "这个对象也能被创建出来，说明一个工厂可以创建很对的对象");
    }
}
