package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.HelloService;

/**
 * 这个类中主要是用来测试service中的helloDao的对象是是否被注入进去了
 * @author LY
 */
public class TextMain2 {
    public static void main(String[] args) {
        HelloService service=new HelloService();
        service.helloService();
    }
}
