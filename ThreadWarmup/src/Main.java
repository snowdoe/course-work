/**
 * Created by machu on 2017-05-07.
 */
public class Main {
    public static void main(String[] args) {
        DigitSumator digitSumator1 = new DigitSumator(111);
        DigitSumator digitSumator2 = new DigitSumator(112);
        Thread t1 = new Thread(digitSumator1);
        Thread t2 = new Thread(digitSumator2);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("Suma 1: %d",digitSumator1.getSuma()));
        System.out.println(String.format("Suma 2: %d",digitSumator2.getSuma()));

    }
}
