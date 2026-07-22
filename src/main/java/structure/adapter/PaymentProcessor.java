package structure.adapter;

public interface PaymentProcessor {

    boolean processPayment(double amountInEuros, String customerEmail);
}
