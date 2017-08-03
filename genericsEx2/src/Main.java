/**
 * Created by machu on 2017-05-06.
 */
public class Main {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        Box<String> box2 = new Box<>();

        for (int i = 0;i<10;++i){
            box1.add(i);
            box2.add("Numer: "+i);
        }
        System.out.println(box1.getList().toString());
        System.out.println(box2.getList().toString());



    }
}
