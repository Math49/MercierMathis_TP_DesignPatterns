package Factory.src.products;

public class AnnonceVente implements Annonce {
    private final String titre;
    private final double prixTotal;

    public AnnonceVente(String titre, double prixTotal) {
        this.titre = titre;
        this.prixTotal = prixTotal;
    }

    @Override
    public String getTitre() {
        return titre;
    }

    @Override
    public double prixMensuelOuTotal() {
        return prixTotal;
    }

    @Override
    public String type() {
        return "VENTE";
    }
}
