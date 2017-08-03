import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

/**
 * Created by machu on 2017-06-10.
 */
public class Main {

    private static int part(int T[]) {

        int value = T[T.length / 2];
        int indexToReturn = 0;
        for (int i = 0; i < T.length; i++) {
            if (T[i] <= value) indexToReturn++;
        }
        int amountOnTheRight = T.length - indexToReturn - 1;
        int amountOnTheLeft = T.length - amountOnTheRight - 1;



        return indexToReturn;
        ;


    }

    public static void main(String[] args) {

    }
}
