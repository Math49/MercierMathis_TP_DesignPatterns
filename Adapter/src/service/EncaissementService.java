package Adapter.src.service;

import Adapter.src.model.PaymentResult;
import Adapter.src.target.PaiementService;

public class EncaissementService {

    private final PaiementService paiement;

    public EncaissementService(PaiementService paiement) {
        this.paiement = paiement;
    }

    public void encaisserReservation(String clientId, double montant) {
        PaymentResult result = paiement.payer(clientId, montant, "EUR");
        System.out.println("Encaissement pour " + clientId + " -> " + result);
    }
}
