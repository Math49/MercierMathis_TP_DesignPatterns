package Factory.src.products;

public class AnnonceViager implements Annonce {
    private final String titre;
    private final double bouquet;

    public AnnonceViager(String titre, double bouquet) {
        this.titre = titre;
        this.bouquet = bouquet;
    }

    @Override
    public String getTitre() {
        return titre;
    }

    @Override
    public double prixMensuelOuTotal() {
        return bouquet;
    }

    @Override
    public String type() {
        return "VIAGER";
    }
}
