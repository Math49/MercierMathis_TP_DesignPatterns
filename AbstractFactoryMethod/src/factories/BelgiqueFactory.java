package AbstractFactoryMethod.src.factories;

import AbstractFactoryMethod.src.products.CalculateurTaxes;
import AbstractFactoryMethod.src.products.ContratLocation;
import AbstractFactoryMethod.src.products.be.ContratLocationBE;
import AbstractFactoryMethod.src.products.be.TaxesBE;

public class BelgiqueFactory implements PaysFactory {
    @Override
    public ContratLocation creerContratLocation() {
        return new ContratLocationBE();
    }

    @Override
    public CalculateurTaxes creerCalculateurTaxes() {
        return new TaxesBE();
    }
}
