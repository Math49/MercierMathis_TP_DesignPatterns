package AbstractFactoryMethod.src.products.be;

import AbstractFactoryMethod.src.products.ContratLocation;

public class ContratLocationBE implements ContratLocation {
    @Override
    public String genererTexte(String locataire, String bien) {
        return "Contrat de location (BE)\nLocataire: " + locataire + "\nBien: " + bien
                + "\nMentions: Réglementation belge, clauses adaptées BE.";
    }

    @Override
    public String pays() {
        return "BE";
    }
}