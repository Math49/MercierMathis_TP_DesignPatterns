package Builder.src.builder;

import Builder.src.product.AnnoncePremium;

public class AnnoncePremiumBuilder implements AnnonceBuilder {

    private String titre;
    private double prix;

    private boolean miseEnAvantAccueil;
    private boolean photosHD;
    private boolean visiteVirtuelle;
    private boolean boostReseaux;
    private int dureeMiseEnAvantJours;
    private boolean banniereSponsorisee;

    @Override
    public AnnonceBuilder titre(String titre) {
        this.titre = titre;
        return this;
    }

    @Override
    public AnnonceBuilder prix(double prix) {
        this.prix = prix;
        return this;
    }

    @Override
    public AnnonceBuilder miseEnAvantAccueil() {
        this.miseEnAvantAccueil = true;
        return this;
    }

    @Override
    public AnnonceBuilder photosHD() {
        this.photosHD = true;
        return this;
    }

    @Override
    public AnnonceBuilder visiteVirtuelle() {
        this.visiteVirtuelle = true;
        return this;
    }

    @Override
    public AnnonceBuilder boostReseaux() {
        this.boostReseaux = true;
        return this;
    }

    @Override
    public AnnonceBuilder dureeMiseEnAvant(int jours) {
        this.dureeMiseEnAvantJours = jours;
        return this;
    }

    @Override
    public AnnonceBuilder banniereSponsorisee() {
        this.banniereSponsorisee = true;
        return this;
    }

    @Override
    public AnnoncePremium build() {
        // Validation des champs obligatoires
        if (titre == null || titre.isBlank()) {
            throw new IllegalStateException("Le titre est obligatoire.");
        }
        if (prix <= 0) {
            throw new IllegalStateException("Le prix doit être > 0.");
        }

        return new AnnoncePremium(
                titre,
                prix,
                miseEnAvantAccueil,
                photosHD,
                visiteVirtuelle,
                boostReseaux,
                dureeMiseEnAvantJours,
                banniereSponsorisee
        );
    }
}
