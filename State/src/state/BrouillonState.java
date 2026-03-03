package State.src.state;

import State.src.model.Annonce;

public class BrouillonState implements EtatAnnonce {

    @Override
    public void publier(Annonce annonce) {
        System.out.println("Annonce publiée.");
        annonce.setEtat(new PublieeState());
    }

    @Override
    public void archiver(Annonce annonce) {
        System.out.println("Impossible d'archiver une annonce brouillon.");
    }

    @Override
    public void modifierPrix(Annonce annonce, double nouveauPrix) {
        annonce.setPrixInterne(nouveauPrix);
        System.out.println("Prix modifié (brouillon) : " + nouveauPrix);
    }
}
