import com.crisite.dao.Car;
import com.crisite.factory.StaticCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class TestFactory1 {
    public static void main(String[] args) {
        Car car = StaticCarFactory.getCar(1);
        System.out.println(car);

        ApplicationContext context = new ClassPathXmlApplicationContext("bean-factory.xml");
        Car bean = context.getBean("car", Car.class);
        System.out.println(car);
    }
}
