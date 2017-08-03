import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by machu on 2017-05-06.
 */
public class Timer implements Runnable {

    int timeLeft;
    boolean isRunning=true;

    public Timer(int time) {

        this.timeLeft = time;
    }
    public boolean isRunning(){
        return isRunning;
    }
    @Override
    public void run() {

        while (timeLeft > 0) {
            --timeLeft;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isRunning = false;

    }

    public int getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
    }
}
