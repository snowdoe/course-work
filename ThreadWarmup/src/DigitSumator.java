/**
 * Created by machu on 2017-05-07.
 */
public class DigitSumator implements Runnable {
    private long n;
    private long suma;

    public DigitSumator(long n) {
        this.n = n;
    }

    public long getSumOfDigits() {
        long sum = 0;
        long temp = n;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

    @Override
    public void run() {
        suma = getSumOfDigits();
    }

    public long getN() {
        return n;
    }

    public long getSuma() {
        return suma;
    }
}
