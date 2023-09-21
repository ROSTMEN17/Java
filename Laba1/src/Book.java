public class Book {
    String Name;
    String Author;
    int isbn;
    int year;

    public Book(String _Name, String _Author, int _isbn, int _year) {
        this.Name = _Name;
        this.Author = _Author;
        this.isbn = _isbn;
        this.year = _year;
    }


    public void getValue() {
        System.out.println("Name" + Name + "Author" + Author + "isbn" + isbn + "year");

    }
}
