import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by machu on 2017-05-07.
 */
public class Main {
    public static void main(String[] args) {
        Text text = new Text();
        Author author = new Author(text);
        Reader reader = new Reader(text);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //uruchomienie watkow Readera i Writera
        executorService.execute(author);
        executorService.execute(reader);

        //kiedy watki skoncza prace Executor ma je kill'im
        executorService.shutdown();
    }
}
