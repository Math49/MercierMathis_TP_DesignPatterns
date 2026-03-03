package Facade.src;

import Facade.src.facade.DossierVenteFacade;
import Facade.src.model.DossierVente;

public class Main {
    public static void main(String[] args) {
        DossierVenteFacade facade = new DossierVenteFacade();

        DossierVente dossier = facade.creerDossierVente("prop_001", "bien_777", 250000);
        System.out.println("Dossier créé : " + dossier);
    }
}