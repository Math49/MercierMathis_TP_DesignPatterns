package Factory.src.creators;

import Factory.src.products.Annonce;
import Factory.src.products.AnnonceLocation;

public class LocationCreator extends AnnonceCreator {
    @Override
    protected Annonce factoryMethod(String titre, double montant) {
        return new AnnonceLocation(titre, montant);
    }
}
