package Builder.src.director;

import Builder.src.builder.AnnoncePremiumBuilder;
import Builder.src.product.AnnoncePremium;

public class AnnonceDirector {

    public AnnoncePremium packStandard(String titre, double prix) {
        return new AnnoncePremiumBuilder()
                .titre(titre)
                .prix(prix)
                .build();
    }

    public AnnoncePremium packPremium(String titre, double prix) {
        return new AnnoncePremiumBuilder()
                .titre(titre)
                .prix(prix)
                .photosHD()
                .boostReseaux()
                .dureeMiseEnAvant(14)
                .build();
    }

    public AnnoncePremium packUltra(String titre, double prix) {
        return new AnnoncePremiumBuilder()
                .titre(titre)
                .prix(prix)
                .miseEnAvantAccueil()
                .photosHD()
                .visiteVirtuelle()
                .boostReseaux()
                .dureeMiseEnAvant(30)
                .banniereSponsorisee()
                .build();
    }
}