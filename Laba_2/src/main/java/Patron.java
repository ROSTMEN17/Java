import java.util.ArrayList;
import java.util.List;

public class Patron {

    public String name;
    public String idPatron;

    private List<Item> borrowItem;

    public Patron(String name, String id) {
        this.name = name;
        this.idPatron = id;
        borrowItem = new ArrayList<Item>();
    }

    public void Borrow(Item item) {
        borrowItem.add(item);
    }

    public  void Return(Item item) {
        borrowItem.remove(item);
    }
}
