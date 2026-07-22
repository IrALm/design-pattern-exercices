package structure.adapter;

public class CheckoutService {

    private final PaymentProcessor processor;

    public CheckoutService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void completeOrder(double totalAmount, String userEmail) {
        boolean success = processor.processPayment(totalAmount, userEmail);
        if (success) {
            System.out.println("Commande validée : paiement de " + totalAmount + " € accepté pour " + userEmail);
        } else {
            System.out.println("Échec du paiement de " + totalAmount + " € pour " + userEmail);
        }
    }
}
