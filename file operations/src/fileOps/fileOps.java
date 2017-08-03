package fileOps;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * Created by machu on 2017-04-01.
 */
public class fileOps {

    public static void main(String[] args) {

//      zadanie2();
//        zadanie3();
//        zadanie4();
        zadanie5();

    }

    private static void zadanie5() {
    }

    private static void zadanie4() {
        int choice;
        do {
            System.out.println("-----------MENU------------");
            System.out.println("1 - Stworz plik");
            System.out.println("2 - Stworz katalog");
            System.out.println("0 - Wyjdz z programu");
            System.out.println("Wybierz opcje:");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            if ((choice == 1) || (choice == 2)) createNew(choice);
        } while ((choice > 0) || (choice < 2));

    }

    private static void createNew(int choice) {

        System.out.println("Podaj sciezke: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path);
        if (!file.exists()) {
            if (choice == 1) try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            else if (choice == 2)
                file.mkdir();
        }
        else System.out.println("Podana sciezka juz istnieje!!");

    }


    private static void zadanie3() {
        File file = new File("C:\\temporary\\test.txt");

        try {
            Files
                    .readAllLines(file.toPath())
                    .forEach(System.out::println);

        } catch (Exception e) {
        }
    }


    private static void zadanie2() {

        File file = new File("C:\\temporary\\test.txt");
        FileOutputStream fout = null;
        Scanner scanner = new Scanner(System.in);
        String buffer;
        try {
            fout = new FileOutputStream(file, true);
            do {
                buffer = scanner.nextLine();
                if (!(buffer.equals("exit")))
                    fout.write((buffer + "\n").getBytes());
            } while ((!(buffer.toLowerCase().equals("exit"))));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (fout != null) try {
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
