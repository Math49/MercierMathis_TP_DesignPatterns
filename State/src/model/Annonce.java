package State.src.model;

import State.src.state.BrouillonState;
import State.src.state.EtatAnnonce;

public class Annonce {

    private final String titre;
    private double prix;
    private EtatAnnonce etat;

    public Annonce(String titre, double prix) {
        this.titre = titre;
        this.prix = prix;
        this.etat = new BrouillonState();
    }

    public void setEtat(EtatAnnonce etat) {
        this.etat = etat;
    }

    public void publier() {
        etat.publier(this);
    }

    public void archiver() {
        etat.archiver(this);
    }

    public void modifierPrix(double nouveauPrix) {
        etat.modifierPrix(this, nouveauPrix);
    }

    public double getPrix() {
        return prix;
    }

    public void setPrixInterne(double prix) {
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }
}
