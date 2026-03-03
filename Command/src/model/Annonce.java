package Command.src.model;

public class Annonce {

    private final String titre;
    private double prix;

    public Annonce(String titre, double prix) {
        this.titre = titre;
        this.prix = prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public String getTitre() {
        return titre;
    }
}