package Builder.src.builder;

import Builder.src.product.AnnoncePremium;

public interface AnnonceBuilder {
    AnnonceBuilder titre(String titre);
    AnnonceBuilder prix(double prix);

    AnnonceBuilder miseEnAvantAccueil();
    AnnonceBuilder photosHD();
    AnnonceBuilder visiteVirtuelle();
    AnnonceBuilder boostReseaux();
    AnnonceBuilder dureeMiseEnAvant(int jours);
    AnnonceBuilder banniereSponsorisee();

    AnnoncePremium build();
}
