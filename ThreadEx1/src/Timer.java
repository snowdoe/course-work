/**
 * Created by machu on 2017-05-06.
 */
public class Timer extends Thread {

    @Override
    public void run() {
        int minuteCount = 0;
        while (true) {
            for (int i = 1; i <= 60; ++i) {
                if (i < 60) {
                    System.out.print(i + "s ");
                } else {
                    System.out.println(++minuteCount + "min ");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
