import com.iamning.pojo.Student;
import com.iamning.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student =(Student) context.getBean("student");
        System.out.println(student.toString());
        /*
        测试输出内容
        Student(name=张三,
        address=Address(address=兰州),
        books=[本手, 妙手, 俗手],
        hobbys=[唱歌, 跳舞, 篮球, rap, 你干嘛~~~],
        card={身份证=1562245488798989, 银行卡号=566591568595656},
        games=[LOL, DOTA2, COD],
        info={学号=17488155, 性别=男, 姓名=张三疯},
        wife=null)
         */

    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user2",User.class);
        User user2 = context.getBean("user2",User.class);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user==user2);


    }
}
