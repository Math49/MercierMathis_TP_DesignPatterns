package AbstractFactoryMethod.src.products.fr;

import AbstractFactoryMethod.src.products.CalculateurTaxes;

public class TaxesFR implements CalculateurTaxes {
    @Override
    public double calculerTaxes(double montant) {
        return montant * 0.10; // 10%
    }

    @Override
    public String pays() {
        return "FR";
    }
}
