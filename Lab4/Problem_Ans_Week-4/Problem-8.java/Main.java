public class Main {
    public static void main(String[] args) {
        Payment p1 = new CreditCarPayment();
        Payment p2 = new PayPalPayment();

        p1.processPayment();
        p2.processPayment();
    }
}
