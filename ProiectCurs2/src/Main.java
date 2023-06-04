public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        ShoppingCart cart1 = ShoppingCart.getInstance();
        cart1.addBook(new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 15.99));
        cart1.addBook(new FictionBook("To Kill a Mockingbird", "Harper Lee", 12.99));

        ShoppingCart cart2 = ShoppingCart.getInstance();
        cart2.addBook(new FictionBook("1984", "George Orwell", 9.99));
        cart2.addBook(new FictionBook("Brave New World", "Aldous Huxley", 11.99));

        System.out.println("Total price for cart1: " + cart1.getTotalPrice());
        System.out.println("Total price for cart2: " + cart2.getTotalPrice());

        // Factory Pattern
        Book book = BookFactory.createBook("fiction", "The Catcher in the Rye", "J.D. Salinger", 10.0);

        // Observer Pattern
        NotificationService notificationService = new NotificationService();
        User user1 = new User("John Doe", "john@example.com");
        User user2 = new User("Jane Smith", "jane@example.com");
        notificationService.subscribe(user1);
        notificationService.subscribe(user2);
        notificationService.notifySubscribers(book);

        // Strategy Pattern
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(29.99);

        // Template Method Pattern
        CheckoutProcess checkoutProcess = new CheckoutProcess() {
            @Override
            protected void selectBooks() {
                System.out.println("Selecting books for checkout...");
            }

            @Override
            protected void applyDiscounts() {
                System.out.println("Applying discounts...");
            }

            @Override
            protected void calculateShipping() {
                System.out.println("Calculating shipping...");
            }

            @Override
            protected void choosePayment() {
                System.out.println("Choosing payment method...");
            }

            @Override
            protected void confirmOrder() {
                System.out.println("Confirming order...");
            }
        };
        checkoutProcess.process();
    }
}