import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    private static ShoppingCart instance;
    private List<Book> books;

    private ShoppingCart() {
        books = new ArrayList<>();
    }

    public static ShoppingCart getInstance() {
        if (instance == null) {
            instance = new ShoppingCart();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Book book : books) {
            total += book.getPrice();
        }
        return total;
    }
}
