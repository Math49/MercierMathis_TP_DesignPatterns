package Strategy.src.context;

import Strategy.src.strategy.FraisTransactionStrategy;

public class TarificationService {

    private FraisTransactionStrategy strategy;

    public TarificationService(FraisTransactionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FraisTransactionStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculer(double montant) {
        return strategy.calculerFrais(montant);
    }
}
