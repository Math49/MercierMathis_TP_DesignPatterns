package Adapter.src.target;

import Adapter.src.model.PaymentResult;

public interface PaiementService {
    PaymentResult payer(String clientId, double montant, String devise);
}
