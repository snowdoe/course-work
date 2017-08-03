import java.util.Collection;

/**
 * Created by machu on 2017-05-06.
 */
public class MyConverter {
    public static<T> void fromArrayToCollection ( T[] tab, Collection<T> collection){
        for (T el: tab)
            collection.add(el);
    }
}
