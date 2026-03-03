package AbstractFactoryMethod.src.factories;

import AbstractFactoryMethod.src.products.ContratLocation;
import AbstractFactoryMethod.src.products.CalculateurTaxes;

public interface PaysFactory {
    ContratLocation creerContratLocation();
    CalculateurTaxes creerCalculateurTaxes();
}
