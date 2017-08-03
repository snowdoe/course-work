import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by machu on 2017-05-07.
 */
public class MyArray {
    public static List<Integer> map (List<Integer> list, MyOperation o ){
        List<Integer> result = new ArrayList<>();
        list.forEach(a->result.add(o.operation(a)));
        return result;



    }


}
