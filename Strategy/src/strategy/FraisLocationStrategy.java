package Strategy.src.strategy;

public class FraisLocationStrategy implements FraisTransactionStrategy {

    @Override
    public double calculerFrais(double montant) {
        return montant * 0.10; // 10% du loyer annuel fictif
    }

    @Override
    public String description() {
        return "Frais de location (10%)";
    }
}
