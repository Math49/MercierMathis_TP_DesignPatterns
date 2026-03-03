package Observer.src.observers;

import Observer.src.model.Annonce;

public class StatistiquesService implements AnnonceObserver {

    @Override
    public void update(Annonce annonce) {
        System.out.println("📈 Statistiques recalculées (nouveau prix : "
                + annonce.getPrix() + ")");
    }
}
