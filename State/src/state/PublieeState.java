package State.src.state;

import State.src.model.Annonce;

public class PublieeState implements EtatAnnonce {

    @Override
    public void publier(Annonce annonce) {
        System.out.println("Déjà publiée.");
    }

    @Override
    public void archiver(Annonce annonce) {
        System.out.println("Annonce archivée.");
        annonce.setEtat(new ArchiveeState());
    }

    @Override
    public void modifierPrix(Annonce annonce, double nouveauPrix) {
        annonce.setPrixInterne(nouveauPrix);
        System.out.println("Prix modifié (publiée) : " + nouveauPrix);
    }
}