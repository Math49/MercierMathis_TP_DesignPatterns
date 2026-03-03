package Decorator.src.decorators;

import Decorator.src.component.CommissionCalculator;

public class PremiumDecorator extends CommissionDecorator {

    public PremiumDecorator(CommissionCalculator inner) {
        super(inner);
    }

    @Override
    public double calculer(double prixVente) {
        double base = inner.calculer(prixVente);
        return base + (prixVente * 0.005);
    }

    @Override
    public String description() {
        return inner.description() + " + Option Premium (+0.5%)";
    }
}
