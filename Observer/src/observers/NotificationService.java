package Observer.src.observers;

import Observer.src.model.Annonce;

public class NotificationService implements AnnonceObserver {

    @Override
    public void update(Annonce annonce) {
        System.out.println("📩 Notification envoyée : nouveau prix pour "
                + annonce.getTitre() + " = " + annonce.getPrix());
    }
}
