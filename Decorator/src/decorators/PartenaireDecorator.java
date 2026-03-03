package Decorator.src.decorators;

import Decorator.src.component.CommissionCalculator;

public class PartenaireDecorator extends CommissionDecorator {

    public PartenaireDecorator(CommissionCalculator inner) {
        super(inner);
    }

    @Override
    public double calculer(double prixVente) {
        double total = inner.calculer(prixVente);
        return total * 0.90;
    }

    @Override
    public String description() {
        return inner.description() + " + Partenariat (-10% commission)";
    }
}
