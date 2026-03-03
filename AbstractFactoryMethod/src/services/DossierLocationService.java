package AbstractFactoryMethod.src.services;

import AbstractFactoryMethod.src.factories.PaysFactory;
import AbstractFactoryMethod.src.products.CalculateurTaxes;
import AbstractFactoryMethod.src.products.ContratLocation;

public class DossierLocationService {
    private final PaysFactory factory;

    public DossierLocationService(PaysFactory factory) {
        this.factory = factory;
    }

    public void imprimerDossier(String locataire, String bien, double loyer) {
        ContratLocation contrat = factory.creerContratLocation();
        CalculateurTaxes taxes = factory.creerCalculateurTaxes();

        System.out.println("Pays factory : " + contrat.pays());
        System.out.println();
        System.out.println(contrat.genererTexte(locataire, bien));
        System.out.println();
        System.out.println("Loyer: " + loyer + " EUR");
        System.out.println("Taxes (" + taxes.pays() + "): " + taxes.calculerTaxes(loyer) + " EUR");
    }
}