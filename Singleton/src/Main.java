package Singleton.src;

import Singleton.src.services.AnnonceService;
import Singleton.src.services.ContratService;

public class Main {
    public static void main(String[] args) {
        AnnonceService annonceService = new AnnonceService();
        ContratService contratService = new ContratService();

        double prixHT = 120000.0;
        double prixTTC = annonceService.calculerPrixTTC(prixHT);

        System.out.println("Prix HT : " + prixHT);
        System.out.println("Prix TTC : " + prixTTC);
        System.out.println();

        System.out.println(contratService.genererEnteteContrat());
    }
}

