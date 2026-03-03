package Composite.src.composite;

import Composite.src.component.BienImmobilier;
import java.util.ArrayList;
import java.util.List;

public class EnsembleImmobilier implements BienImmobilier {

    private final String nom;
    private final List<BienImmobilier> elements = new ArrayList<>();

    public EnsembleImmobilier(String nom) {
        this.nom = nom;
    }

    public void ajouter(BienImmobilier bien) {
        elements.add(bien);
    }

    public void retirer(BienImmobilier bien) {
        elements.remove(bien);
    }

    @Override
    public double getValeurTotale() {
        double total = 0;
        for (BienImmobilier bien : elements) {
            total += bien.getValeurTotale();
        }
        return total;
    }

    @Override
    public String getNom() {
        return nom;
    }
}
