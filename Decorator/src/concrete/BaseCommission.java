package Decorator.src.concrete;

import Decorator.src.component.CommissionCalculator;

public class BaseCommission implements CommissionCalculator {

    @Override
    public double calculer(double prixVente) {
        return prixVente * 0.04;
    }

    @Override
    public String description() {
        return "Commission de base (4%)";
    }
}