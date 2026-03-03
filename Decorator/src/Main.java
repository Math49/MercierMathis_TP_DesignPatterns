package Decorator.src;

import Decorator.src.component.CommissionCalculator;
import Decorator.src.concrete.BaseCommission;
import Decorator.src.decorators.PartenaireDecorator;
import Decorator.src.decorators.PremiumDecorator;
import Decorator.src.decorators.UrgenceDecorator;

public class Main {
    public static void main(String[] args) {
        double prixVente = 250000;

        CommissionCalculator c1 = new BaseCommission();
        afficher(prixVente, c1);

        CommissionCalculator c2 = new PremiumDecorator(new BaseCommission());
        afficher(prixVente, c2);

        CommissionCalculator c3 = new PremiumDecorator(
                new UrgenceDecorator(new BaseCommission())
        );
        afficher(prixVente, c3);

        CommissionCalculator c4 = new PartenaireDecorator(
                new PremiumDecorator(
                        new UrgenceDecorator(new BaseCommission())
                )
        );
        afficher(prixVente, c4);
    }

    private static void afficher(double prixVente, CommissionCalculator calc) {
        System.out.println(calc.description());
        System.out.println("Prix vente : " + prixVente + " EUR");
        System.out.println("Commission : " + calc.calculer(prixVente) + " EUR");
        System.out.println();
    }
}

