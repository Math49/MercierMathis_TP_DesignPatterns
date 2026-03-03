package Factory.src.products;

public class AnnonceLocation implements Annonce {
    private final String titre;
    private final double loyerMensuel;

    public AnnonceLocation(String titre, double loyerMensuel) {
        this.titre = titre;
        this.loyerMensuel = loyerMensuel;
    }

    @Override
    public String getTitre() {
        return titre;
    }

    @Override
    public double prixMensuelOuTotal() {
        return loyerMensuel;
    }

    @Override
    public String type() {
        return "LOCATION";
    }
}
