import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by machu on 2017-05-07.
 */
public class MyArrayTest {
    @Test
    public void simpleTest() {
        List<Integer> elements = new ArrayList<>();
        elements.add(5);
        elements.add(8);
        elements.add(12);

        List<Integer> res = MyArray.map(elements, (a) -> a + 1);

        assertTrue(res.size()==3 && res.get(1).equals(9));
    }
}

