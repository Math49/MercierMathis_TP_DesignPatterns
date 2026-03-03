package Adapter.src.external;

import java.util.UUID;

public class StripeApi {

    public StripeReceipt charge(int cents, String currency, String customerRef) {
        boolean paid = !customerRef.contains("404");
        String id = "ch_" + UUID.randomUUID();

        String details = "charged " + cents + " " + currency + " for " + customerRef;
        return new StripeReceipt(id, paid, details);
    }
}
