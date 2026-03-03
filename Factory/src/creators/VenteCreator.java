package Factory.src.creators;

import Factory.src.products.Annonce;
import Factory.src.products.AnnonceVente;

public class VenteCreator extends AnnonceCreator {
    @Override
    protected Annonce factoryMethod(String titre, double montant) {
        return new AnnonceVente(titre, montant);
    }
}
