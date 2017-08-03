import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by machu on 2017-05-28.
 */
public class Operations {

    @Autowired
    private SpecialMath math;

    public double compute(double a, double b){
        return Math.PI + math.integral(a,b,100, (i)->i*i);
    }

}
