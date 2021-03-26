import com.lz.controller.HelloController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   private BeanFactory factory=new ClassPathXmlApplicationContext("ApplicationContext.xml");


    @org.junit.Test
    public void test1(){
        HelloController helloController=(HelloController)factory.getBean("helloController");
        System.out.println(helloController);
        helloController.hello();
    }
}
