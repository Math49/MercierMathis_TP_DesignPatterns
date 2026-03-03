package Factory.src;

import Factory.src.creators.AnnonceCreator;
import Factory.src.creators.LocationCreator;
import Factory.src.creators.VenteCreator;
import Factory.src.creators.ViagerCreator;
import Factory.src.products.Annonce;

public class Main {
    public static void main(String[] args) {
        AnnonceCreator vente = new VenteCreator();
        AnnonceCreator location = new LocationCreator();
        AnnonceCreator viager = new ViagerCreator();

        Annonce a1 = vente.creerAnnonce("Maison 120m2 avec jardin", 245000);
        Annonce a2 = location.creerAnnonce("T2 centre-ville meublé", 850);
        Annonce a3 = viager.creerAnnonce("Appartement viager occupé", 60000);

        afficher(a1);
        afficher(a2);
        afficher(a3);
    }

    private static void afficher(Annonce annonce) {
        System.out.println("[" + annonce.type() + "] " + annonce.getTitre());
        System.out.println("Montant : " + annonce.prixMensuelOuTotal() + " EUR");
        System.out.println();
    }
}
