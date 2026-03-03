package Factory.src.creators;

import Factory.src.products.Annonce;

public abstract class AnnonceCreator {

    public Annonce creerAnnonce(String titre, double montant) {
        // Ici on pourrait mettre des règles communes (validation, formatage, log...)
        if (titre == null || titre.isBlank()) {
            throw new IllegalArgumentException("Le titre est obligatoire.");
        }
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant doit être > 0.");
        }
        return factoryMethod(titre, montant);
    }

    protected abstract Annonce factoryMethod(String titre, double montant);
}
