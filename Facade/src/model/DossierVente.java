package Facade.src.model;

public class DossierVente {
    private final String proprietaireId;
    private final String bienId;
    private final double prixVente;
    private final double commission;
    private final String contratGenere;

    public DossierVente(String proprietaireId, String bienId, double prixVente, double commission, String contratGenere) {
        this.proprietaireId = proprietaireId;
        this.bienId = bienId;
        this.prixVente = prixVente;
        this.commission = commission;
        this.contratGenere = contratGenere;
    }

    @Override
    public String toString() {
        return "DossierVente{" +
                "proprietaireId='" + proprietaireId + '\'' +
                ", bienId='" + bienId + '\'' +
                ", prixVente=" + prixVente +
                ", commission=" + commission +
                ", contratGenere='" + contratGenere + '\'' +
                '}';
    }
}