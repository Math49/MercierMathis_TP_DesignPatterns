package AbstractFactoryMethod.src.products.be;

import AbstractFactoryMethod.src.products.CalculateurTaxes;

public class TaxesBE implements CalculateurTaxes {
    @Override
    public double calculerTaxes(double montant) {
        return montant * 0.07; // 7%
    }

    @Override
    public String pays() {
        return "BE";
    }
}
