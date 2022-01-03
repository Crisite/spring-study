import com.crisite.dao.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-autowired.xml");
        Users users = (Users)applicationContext.getBean("user");
        System.out.println(users);
    }

}
