import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by machu on 2017-05-27.
 */
public class Main {

    public static void fun1(XMLParser reader){
        //...
        reader.parse("c:\\test1.xml");
    }
    public static void fun2(XMLParser reader){
        //...
        reader.parse("c:\\test2.xml");
    }
    public static void fun3(XMLParser reader){
        //...
        reader.parse("c:\\test3.xml");
    }

    public static void main(String[] args) {


        //chce referencji na obiekt starego XML Parsera
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        //zazadanie od Springa zrobienia obiektu i zwrocenia na ten obiekt referencji

        XMLParser pars = (XMLParser)context.getBean("xMLParserImpl");
        pars.parse("c:\\test.xml");

        XMLParser newparser = (XMLParser)context.getBean("superXMLParserAdapter");

        fun2(newparser);
        fun1(newparser);



    }
}
