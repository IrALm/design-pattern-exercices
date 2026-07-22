package structure.adapter;

public class Main {

    public static void main(String[] args) {
        PayFastSDK payFastSDK = new PayFastSDK();
        PaymentProcessor processor = new PayFastAdapter(payFastSDK);
        CheckoutService checkoutService = new CheckoutService(processor);

        checkoutService.completeOrder(49.99, "client@example.com");
    }
}
