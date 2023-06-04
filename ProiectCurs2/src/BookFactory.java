public class BookFactory {
    public static Book createBook(String bookType, String title, String author, double price) {
        if (bookType.equalsIgnoreCase("fiction")) {
            return new FictionBook(title, author, price);
        } else if (bookType.equalsIgnoreCase("nonfiction")) {
            return new NonFictionBook(title, author, price);
        } else {
            throw new IllegalArgumentException("Invalid book type");
        }
    }
}
