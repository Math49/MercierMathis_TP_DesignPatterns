package AbstractFactoryMethod.src.factories;

import AbstractFactoryMethod.src.products.CalculateurTaxes;
import AbstractFactoryMethod.src.products.ContratLocation;
import AbstractFactoryMethod.src.products.fr.ContratLocationFR;
import AbstractFactoryMethod.src.products.fr.TaxesFR;

public class FranceFactory implements PaysFactory {
    @Override
    public ContratLocation creerContratLocation() {
        return new ContratLocationFR();
    }

    @Override
    public CalculateurTaxes creerCalculateurTaxes() {
        return new TaxesFR();
    }
}
