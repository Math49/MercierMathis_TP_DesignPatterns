package Composite.src;

import Composite.src.component.BienImmobilier;
import Composite.src.composite.EnsembleImmobilier;
import Composite.src.leaf.Appartement;
import Composite.src.leaf.Maison;

public class Main {
    public static void main(String[] args) {

        BienImmobilier appart1 = new Appartement("Studio centre-ville", 120000);
        BienImmobilier appart2 = new Appartement("T2 proche gare", 180000);
        BienImmobilier maison1 = new Maison("Maison campagne", 250000);

        EnsembleImmobilier immeuble = new EnsembleImmobilier("Immeuble A");
        immeuble.ajouter(appart1);
        immeuble.ajouter(appart2);

        EnsembleImmobilier portefeuille = new EnsembleImmobilier("Portefeuille Investisseur");
        portefeuille.ajouter(immeuble);
        portefeuille.ajouter(maison1);

        System.out.println("Valeur appartement seul : " + appart1.getValeurTotale());
        System.out.println("Valeur immeuble : " + immeuble.getValeurTotale());
        System.out.println("Valeur portefeuille complet : " + portefeuille.getValeurTotale());
    }
}
