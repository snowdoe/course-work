import java.util.HashSet;
import java.util.Set;

/**
 * Created by machu on 2017-05-06.
 */
public class Main {
    public static void main(String[] args) {
        Set<String> answers = new HashSet<>();
        answers.add("AAA");
        answers.add("BBB");
        answers.add("CCC");
        String question = "Dawaj dawaj??";
        int time = 105;
        Quiz quiz = new Quiz(answers,question,time);
        new Thread(quiz).start();

    }
}
