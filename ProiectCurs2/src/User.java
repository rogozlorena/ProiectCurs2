public class User implements Subscriber {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void notify(Book book) {
        System.out.println("Dear " + name + ", the book '" + book.getTitle() + "' is now available.");
    }
}
