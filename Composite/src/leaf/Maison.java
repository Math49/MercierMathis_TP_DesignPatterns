package Composite.src.leaf;

import Composite.src.component.BienImmobilier;

public class Maison implements BienImmobilier {

    private final String nom;
    private final double valeur;

    public Maison(String nom, double valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }

    @Override
    public double getValeurTotale() {
        return valeur;
    }

    @Override
    public String getNom() {
        return nom;
    }
}
