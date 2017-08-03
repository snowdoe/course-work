package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> bookList = new ArrayList<>();


    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytul: ");
        String title = scanner.nextLine();
        System.out.println("Podaj autora: ");
        String author = scanner.nextLine();
        Book book = new Book(title, author);
        bookList.add(book);
    }

    public void addBooks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ile ksiazek dodac?");
        int k = s.nextInt();
        for (int i = 0; i < k; ++i) {
            addBook();
        }
    }

    public void listAllBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

}
