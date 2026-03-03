package State.src.state;

import State.src.model.Annonce;

public class ArchiveeState implements EtatAnnonce {

    @Override
    public void publier(Annonce annonce) {
        System.out.println("Impossible de republier une annonce archivée.");
    }

    @Override
    public void archiver(Annonce annonce) {
        System.out.println("Déjà archivée.");
    }

    @Override
    public void modifierPrix(Annonce annonce, double nouveauPrix) {
        System.out.println("Impossible de modifier le prix d'une annonce archivée.");
    }
}
