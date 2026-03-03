package Factory.src.creators;

import Factory.src.products.Annonce;
import Factory.src.products.AnnonceViager;

public class ViagerCreator extends AnnonceCreator {
    @Override
    protected Annonce factoryMethod(String titre, double montant) {
        return new AnnonceViager(titre, montant);
    }
}
