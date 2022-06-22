import com.iamning.pojo.User;
import com.iamning.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        //Spring容器 就类似于婚介网站！
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserT user = (UserT) context.getBean("u2");

        user.show();


    }
}
