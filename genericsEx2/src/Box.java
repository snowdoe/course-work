import java.util.LinkedList;
import java.util.List;

/**
 * Created by machu on 2017-05-06.
 */
public class Box<T> {
    private List<T> list;

    public Box(List<T> list) {
        this.list = list;
    }

    public Box() {
        this.list = new LinkedList<T>();
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void add(T t) {
        list.add(t);
    }
    public void remove (T t){
        list.remove(t);
    }
}
o