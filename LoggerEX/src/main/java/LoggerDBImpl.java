/**
 * Created by machu on 2017-06-24.
 */
public class LoggerDBImpl extends LoggerDecorator{

    public LoggerDBImpl(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String s) {
        super.log(s);
        System.out.println("logging "+s+" to DB.");


    }
}
