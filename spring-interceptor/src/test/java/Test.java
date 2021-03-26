import org.springframework.beans.factory.annotation.Autowired;

public class Test {
    @Autowired
    private UserController userController;
    @org.junit.Test
    public void test01(){
        System.out.println(userController);
    }
}
