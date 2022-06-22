import com.iamning.service.UserService;
import com.iamning.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //动态代理代理的接口：注意点
        UserService userService = (UserService) context.getBean("userService");

        userService.add();
    }
}
