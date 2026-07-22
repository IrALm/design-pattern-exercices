package structure.adapter;

/**
 * SDK fourni par le prestataire tiers PayFast — dépendance externe, à ne pas modifier.
 */
public class PayFastSDK {

    public int executeTransaction(int amountInCents, String userEmail) {
        System.out.println("[PayFastSDK] Transaction de " + amountInCents + " centimes pour " + userEmail);
        return 200;
    }
}
