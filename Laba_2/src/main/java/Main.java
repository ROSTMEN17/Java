

public class Main {
    public static void main(String[] args) {

        Library library = new Library();


        //Add Book
        library.add(new Book("Фактор Черчилля", "Борис Джонсон", "7654986", "5134","9874"));
        library.add(new Book("Гітлер", "Александр Борисенко", "1488647", "0372","1945"));
        library.add(new Book("Гаррі Поттер і філософський камінь", "Джоан Роулинг", "1466964", "2315","7435"));
        library.add(new Book("Хірург", "Тесс Герритсен", "6474876", "1456","1324"));

        //Add DVD
        library.add(new DVD("Основи C++", "03724568", 120));
        library.add(new DVD("Основи Java", "87456324", 30));
        library.add(new DVD("Нестримні", "6465273", 2));

        System.out.println();
        System.out.println("Перевірка чи можна добавити 2 предмета з одинаковим ID");
        library.add(new Book("Гітлер", "Александр Борисенко", "1488647", "0372","1945"));
        System.out.println();

        //Remove Item
        library.remove(library.GetItem(5));
        System.out.println();

        //Add patron
        library.registerPatron(new Patron("Stas", "1"));
        library.registerPatron(new Patron("Berlin", "32"));
        System.out.println();
        library.registerPatron(new Patron("Tretii", "1"));
        System.out.println();

        //Borrow Item
        library.LendItem(library.GetPatron(0), library.GetItem(4));
        library.LendItem(library.GetPatron(1), library.GetItem(1));
        System.out.println();
        library.listBorrowed();
        System.out.println();

        //Return Item
        library.ReturnItem(library.GetPatron(0), library.GetItem(4));
        System.out.println();
        library.listBorrowed();
        System.out.println();

        //Show info
        System.out.println();
        library.listAvailable();
        System.out.println();
        library.listBorrowed();

        //Old
        library.findItemAtName("Гітлер");
    }
}

