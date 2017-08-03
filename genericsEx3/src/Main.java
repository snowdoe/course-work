import java.util.LinkedList;
import java.util.List;

/**
 * Created by machu on 2017-05-06.
 */
public class Main {
    public static void main(String[] args) {
        Integer T[] = new Integer[]{1,2,3};
        List<Integer> list = new LinkedList<>();

        MyConverter.fromArrayToCollection(T,list);
        System.out.println(list);

    }
}
