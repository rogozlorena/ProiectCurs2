public abstract class CheckoutProcess {
    public void process() {
        selectBooks();
        applyDiscounts();
        calculateShipping();
        choosePayment();
        confirmOrder();
    }

    protected abstract void selectBooks();

    protected abstract void applyDiscounts();

    protected abstract void calculateShipping();

    protected abstract void choosePayment();

    protected abstract void confirmOrder();
}
