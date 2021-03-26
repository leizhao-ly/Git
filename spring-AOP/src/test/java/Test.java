import com.lz.controller.HelloController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    //调用controller中的方法
    private BeanFactory factory=new ClassPathXmlApplicationContext("ApplicationContext.xml");

    @org.junit.Test
    public void test(){
        HelloController helloController=(HelloController) factory.getBean("helloController");
//        System.out.println(helloController+"对象被创建成功了");
        helloController.hello();
    }

}
