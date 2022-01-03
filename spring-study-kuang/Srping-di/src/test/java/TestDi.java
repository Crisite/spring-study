import com.crisite.dao.Students;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("bean.xml");
        Students bean = Context.getBean("student", Students.class);
        System.out.println(bean.toString());
    }
}
