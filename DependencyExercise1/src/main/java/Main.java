import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by machu on 2017-05-28.
 */
public class Main {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Operations op =  (Operations)context.getBean("operations");

        System.out.println(op.compute(12,14));
    }

}
