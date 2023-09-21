import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> booksList = new ArrayList<>();
        String name;
        for (int i = 0; i < 2; i++) {
            System.out.println("Створюєм нову книгу: ");
            System.out.println("Введіть назву книги: ");
            name = scanner.nextLine();

            System.out.println("Введіть автора книги: ");
            String author = scanner.nextLine();

            System.out.println("Введіть ISDN номер: ");
            int isbn = scanner.nextInt();

            System.out.println("Введіть рік книги: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            Book myBook = new Book(name, author, isbn, year);
            booksList.add(myBook);
            System.out.println();
        }

        System.out.println("Ваші книги: ");
        for (int i = 0; i < booksList.size(); i++) {
            Book myBook = booksList.get(i);
            System.out.println("Назва: " + myBook.Name);
            System.out.println("Автор: " + myBook.Author);
            System.out.println("ISDN номер: " + myBook.isbn);
            System.out.println("Рік видання: " + myBook.year);
            System.out.println();
        }

        System.out.println("Введіть назву книги для пошуку: ");
        String targetTitle = scanner.nextLine();

        boolean found = false;
        for (Book book : booksList) {
            if (book.Name.equalsIgnoreCase(targetTitle)) {
                System.out.println("Знайдена книга: ");
                System.out.println("Назва: " + book.Name);
                System.out.println("Автор: " + book.Author);
                System.out.println("ISDN номер: " + book.isbn);
                System.out.println("Рік видання: " + book.year);
                found = true;
                break;
            }
        }

        System.out.println("Введіть номер ISBN книги, яку хочете видалити:");
        int targetIsbn = scanner.nextInt();
        scanner.nextLine();

        boolean removed = booksList.removeIf(book -> book.isbn == targetIsbn);

        if (removed) {
            System.out.println("Книга з ISBN " + targetIsbn + " видалена.");
        } else {
            System.out.println("Книга з ISBN " + targetIsbn + " не знайдена.");
        }
    }
}





