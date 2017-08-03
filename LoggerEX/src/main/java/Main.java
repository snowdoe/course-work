import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by machu on 2017-06-25.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        LoggerMailImpl mail = (LoggerMailImpl)  context.getBean("loggerMailImpl");
        mail.log("wiadomosc jakas");

    }
}
