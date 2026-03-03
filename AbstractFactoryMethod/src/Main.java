package AbstractFactoryMethod.src;

import AbstractFactoryMethod.src.factories.BelgiqueFactory;
import AbstractFactoryMethod.src.factories.FranceFactory;
import AbstractFactoryMethod.src.factories.PaysFactory;
import AbstractFactoryMethod.src.services.DossierLocationService;

public class Main {
    public static void main(String[] args) {
        String locataire = "Mathis Mercier";
        String bien = "T3 - 18 rue des Lilas";
        double loyer = 950.0;

        PaysFactory factoryFR = new FranceFactory();
        PaysFactory factoryBE = new BelgiqueFactory();

        System.out.println("=== DOSSIER FRANCE ===");
        new DossierLocationService(factoryFR).imprimerDossier(locataire, bien, loyer);

        System.out.println("\n=== DOSSIER BELGIQUE ===");
        new DossierLocationService(factoryBE).imprimerDossier(locataire, bien, loyer);
    }
}