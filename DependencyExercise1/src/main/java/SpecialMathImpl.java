/**
 * Created by machu on 2017-05-28.
 */
public class SpecialMathImpl implements SpecialMath {
    public SpecialMathImpl() {
    }

    public double integral(double a, double b, int n, IFun fun) {

        double result = 0;

        //determines the length of each step
        double step = (b - a) / n;

        //sums the area of n rectangles in 'result' variable
        for (int i = 0; i < n; i++) {
            result += step * (fun.function(a + (i * step)));
        }

        return result;
    }
}
