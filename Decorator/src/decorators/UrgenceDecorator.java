package Decorator.src.decorators;

import Decorator.src.component.CommissionCalculator;

public class UrgenceDecorator extends CommissionDecorator {

    public UrgenceDecorator(CommissionCalculator inner) {
        super(inner);
    }

    @Override
    public double calculer(double prixVente) {
        return inner.calculer(prixVente) + 300.0;
    }

    @Override
    public String description() {
        return inner.description() + " + Option Urgence (+300 EUR)";
    }
}
