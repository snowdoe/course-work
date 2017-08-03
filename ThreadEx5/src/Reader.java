import java.util.Random;

/**
 * Created by machu on 2017-05-07.
 */
public class Reader implements Runnable {
    Text text;
    private final static Random rand = new Random();

    public Reader(Text text) {
        this.text = text;
    }

    @Override
    public void run() {

        while (true) {
            text.consumeText();

            try {
                Thread.sleep(100+rand.nextInt(400));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
