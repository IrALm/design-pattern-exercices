package structure.adapter;

public class PayFastAdapter implements PaymentProcessor {

    private final PayFastSDK payFastSDK;

    public PayFastAdapter(PayFastSDK payFastSDK) {
        this.payFastSDK = payFastSDK;
    }

    @Override
    public boolean processPayment(double amountInEuros, String customerEmail) {
        int amountInCents = (int) Math.round(amountInEuros * 100);
        int resultCode = payFastSDK.executeTransaction(amountInCents, customerEmail);
        return resultCode == 200;
    }
}
