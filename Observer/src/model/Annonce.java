package Observer.src.model;

import Observer.src.observers.AnnonceObserver;

import java.util.ArrayList;
import java.util.List;

public class Annonce {

    private final String titre;
    private double prix;
    private final List<AnnonceObserver> observers = new ArrayList<>();

    public Annonce(String titre, double prix) {
        this.titre = titre;
        this.prix = prix;
    }

    public void attach(AnnonceObserver observer) {
        observers.add(observer);
    }

    public void detach(AnnonceObserver observer) {
        observers.remove(observer);
    }

    public void setPrix(double nouveauPrix) {
        if (this.prix != nouveauPrix) {
            this.prix = nouveauPrix;
            notifyObservers();
        }
    }

    public double getPrix() {
        return prix;
    }

    public String getTitre() {
        return titre;
    }

    private void notifyObservers() {
        for (AnnonceObserver observer : observers) {
            observer.update(this);
        }
    }
}