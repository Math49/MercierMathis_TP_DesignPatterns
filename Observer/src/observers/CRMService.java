package Observer.src.observers;

import Observer.src.model.Annonce;

public class CRMService implements AnnonceObserver {

    @Override
    public void update(Annonce annonce) {
        System.out.println("📊 CRM mis à jour pour : "
                + annonce.getTitre());
    }
}
