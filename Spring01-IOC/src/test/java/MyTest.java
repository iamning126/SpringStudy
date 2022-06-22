import com.iamning.dao.UserDaoImpl;
import com.iamning.dao.UserDaoMysqlImpl;
import com.iamning.service.UserService;
import com.iamning.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取ApplicationContext:拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //需要什么就get什么
        UserServiceImpl userServiceImpl =(UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}
