package Adapter.src;

import Adapter.src.adapter.StripePaiementAdapter;
import Adapter.src.external.StripeApi;
import Adapter.src.service.EncaissementService;
import Adapter.src.target.PaiementService;

public class Main {
    public static void main(String[] args) {
        StripeApi stripeApi = new StripeApi();

        PaiementService paiement = new StripePaiementAdapter(stripeApi);

        EncaissementService encaissement = new EncaissementService(paiement);

        encaissement.encaisserReservation("client_123", 199.99);
        encaissement.encaisserReservation("client_404", 49.90);
    }
}
