import com.crisite.dao.Car;
import com.crisite.factory.InstanceCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory2 {
    public static void main(String[] args) {
        InstanceCarFactory instanceCarFactory = new InstanceCarFactory();
        Car car = instanceCarFactory.getCar(1);
        System.out.println(car);

        ApplicationContext context = new ClassPathXmlApplicationContext("bean-factory.xml");
        Car car2 = (Car) context.getBean("car2");
        System.out.println(car2.getClass().getName().toString());
    }

}
