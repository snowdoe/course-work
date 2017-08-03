package rozgrzewka;

import static java.lang.Math.pow;

/**
 * Created by machu on 2017-04-01.
 */
public class funkcja {

    public static void main(String[] args) {
        int x = 3;
        double n = 2;
        double wynik = Sumka(x, n);
        System.out.println(wynik);

    }

    public static double Sumka(int n, double x) {

        return x*(1-pow(x,n))/(1-x);

    }
}
