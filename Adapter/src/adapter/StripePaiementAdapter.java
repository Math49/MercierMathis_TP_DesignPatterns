package Adapter.src.adapter;

import Adapter.src.external.StripeApi;
import Adapter.src.external.StripeReceipt;
import Adapter.src.model.PaymentResult;
import Adapter.src.target.PaiementService;

public class StripePaiementAdapter implements PaiementService {

    private final StripeApi stripe;

    public StripePaiementAdapter(StripeApi stripe) {
        this.stripe = stripe;
    }

    @Override
    public PaymentResult payer(String clientId, double montant, String devise) {
        int cents = (int) Math.round(montant * 100.0);
        String currency = devise.toLowerCase();
        String customerRef = "cust:" + clientId;

        StripeReceipt receipt = stripe.charge(cents, currency, customerRef);

        if (receipt.isPaid()) {
            return new PaymentResult(true, receipt.getId(), "Paiement accepté");
        }
        return new PaymentResult(false, receipt.getId(), "Paiement refusé: " + receipt.getDetails());
    }
}