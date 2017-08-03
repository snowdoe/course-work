import java.util.Random;

/**
 * Created by machu on 2017-05-07.
 */
public class Author implements Runnable {

    private Text text;
    private final static Random rand = new Random();

    public Author(Text text) {
        this.text = text;
    }


    @Override
    public void run() {

        int i = 1;

        while (true) {
            text.produceText("tekst"+i);
            i++;

            try {
                Thread.sleep(100+rand.nextInt(400));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
