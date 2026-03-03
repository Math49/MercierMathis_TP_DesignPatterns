package AbstractFactoryMethod.src.products.fr;

import AbstractFactoryMethod.src.products.ContratLocation;

public class ContratLocationFR implements ContratLocation {
    @Override
    public String genererTexte(String locataire, String bien) {
        return "Contrat de location (FR)\nLocataire: " + locataire + "\nBien: " + bien
                + "\nMentions: Loi française, dépôt de garantie selon règles FR.";
    }

    @Override
    public String pays() {
        return "FR";
    }
}