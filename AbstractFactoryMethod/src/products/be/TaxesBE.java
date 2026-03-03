package AbstractFactoryMethod.src.products.be;

import AbstractFactoryMethod.src.products.CalculateurTaxes;

public class TaxesBE implements CalculateurTaxes {
    // Exemple simplifié (pas une règle réelle)
    @Override
    public double calculerTaxes(double montant) {
        return montant * 0.07; // 7%
    }

    @Override
    public String pays() {
        return "BE";
    }
}
