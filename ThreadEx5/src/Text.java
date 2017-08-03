import java.util.concurrent.Semaphore;

/**
 * Created by machu on 2017-05-07.
 */
public class Text {

    private String text;
    private Semaphore semaphoreAuthor;
    private Semaphore semaphoreReader;

    public Text() {
        this.text = null;
        semaphoreAuthor = new Semaphore(1); //semafor Authora jest podniesiony na starcie
        semaphoreReader = new Semaphore(0); //semafor Readera jest opuszczony na starcie
    }

    public void produceText(String text){

        try {
            //opuszczamy semafor autora
            semaphoreAuthor.acquire();
            System.out.println("Produkowany jest text: " +text);
            this.text = text;

            //zwalniamy semafor watku Readera ktory zostal wczesniej opuszczony
            //daje znac ze reader moze konsumowac
            semaphoreReader.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public String consumeText() {

        try {
            //opuszczamy semafor redeara
            semaphoreReader.acquire();
            System.out.println("Reader czyta text: " +text);

            //zwalniamy semafor watku Authora ktory zostal wczesniej opuszczony
            //daje znac ze Author moze wprowadzac nowy text
            semaphoreAuthor.release();
            return text;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;

    }


}
