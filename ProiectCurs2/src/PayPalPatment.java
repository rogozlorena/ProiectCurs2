public class PayPalPatment implements  PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with PayPal.");
    }
}
