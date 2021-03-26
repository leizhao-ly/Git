package service;

import dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LY
 */
@Service
public class HelloService {

    @Autowired
    private HelloDao helloDao;

    public void helloService(){
        System.out.println(helloDao);
    }
}
