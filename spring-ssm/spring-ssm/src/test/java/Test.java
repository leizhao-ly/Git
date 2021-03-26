import com.lz.controller.UserController;
import com.lz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {
    @Autowired
    private UserService userService;

    @org.junit.Test
    public void test01(){
        System.out.println(userService);
    }
}
