import java.util.*;

/**
 * Created by machu on 2017-05-06.
 */
public class Quiz implements Runnable {
    private Set<String> answerList;
    private String question;
    private int timeLimit;

    public Quiz(Set<String> answerList, String question, int time) {
        this.answerList = answerList;
        this.question = question;
        timeLimit = time;
    }

    private boolean isACorrectAnswer(String s) {
        return answerList.contains(s);
    }

    private boolean answerListIsEmpty() {
        return answerList.isEmpty();
    }

    private void removeIfCorrectAnswer(String s) {
        if (isACorrectAnswer(s)) {
            answerList.remove(s);
        }
    }

    private void getAnswer() {

    }

    @Override
    public void run() {

        Timer timer = new Timer(timeLimit);
        Thread timerThread = new Thread(timer);
        timerThread.start();

        while (!answerListIsEmpty() && timer.isRunning()) {

            System.out.println(question);
            System.out.println("Time left: " + timer.getTimeLeft());
            Scanner s = new Scanner(System.in);
            removeIfCorrectAnswer(s.nextLine());

        }
        if (answerListIsEmpty()) {
            timer.setTimeLeft(0);
            System.out.println("WYGRALES!!!!");
        } else {
            System.out.println("Przegrales!!!");
        }

    }
}
