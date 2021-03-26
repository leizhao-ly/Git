import com.lz.controller.HelloController;
import org.springframework.beans.factory.annotation.Autowired;

public class Test{

    @Autowired
    private HelloController helloController;
    @org.junit.Test
    public void test(){
        System.out.println(helloController);
    }
}