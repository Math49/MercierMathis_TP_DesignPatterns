package State.src.state;

import State.src.model.Annonce;

public interface EtatAnnonce {

    void publier(Annonce annonce);

    void archiver(Annonce annonce);

    void modifierPrix(Annonce annonce, double nouveauPrix);
}
