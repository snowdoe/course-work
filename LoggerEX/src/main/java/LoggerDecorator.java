import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by machu on 2017-06-24.
 */
public abstract class LoggerDecorator implements Logger {
  @Autowired
    protected Logger logger;

    public LoggerDecorator(Logger logger) {
        this.logger = logger;
    }


    public void log (String s){
      logger.log(s);
  }
}
