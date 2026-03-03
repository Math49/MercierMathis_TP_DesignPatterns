package Strategy.src.strategy;

public class FraisVenteStrategy implements FraisTransactionStrategy {

    @Override
    public double calculerFrais(double montant) {
        return montant * 0.04; // 4%
    }

    @Override
    public String description() {
        return "Frais de vente (4%)";
    }
}
