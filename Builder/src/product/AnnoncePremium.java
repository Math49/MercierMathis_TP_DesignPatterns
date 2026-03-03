package Builder.src.product;

public class AnnoncePremium {
    private final String titre;
    private final double prix;

    private final boolean miseEnAvantAccueil;
    private final boolean photosHD;
    private final boolean visiteVirtuelle;
    private final boolean boostReseaux;
    private final int dureeMiseEnAvantJours;
    private final boolean banniereSponsorisee;

    public AnnoncePremium(
            String titre,
            double prix,
            boolean miseEnAvantAccueil,
            boolean photosHD,
            boolean visiteVirtuelle,
            boolean boostReseaux,
            int dureeMiseEnAvantJours,
            boolean banniereSponsorisee
    ) {
        this.titre = titre;
        this.prix = prix;
        this.miseEnAvantAccueil = miseEnAvantAccueil;
        this.photosHD = photosHD;
        this.visiteVirtuelle = visiteVirtuelle;
        this.boostReseaux = boostReseaux;
        this.dureeMiseEnAvantJours = dureeMiseEnAvantJours;
        this.banniereSponsorisee = banniereSponsorisee;
    }

    public String resume() {
        return "AnnoncePremium{\n" +
                "  titre='" + titre + "',\n" +
                "  prix=" + prix + ",\n" +
                "  miseEnAvantAccueil=" + miseEnAvantAccueil + ",\n" +
                "  photosHD=" + photosHD + ",\n" +
                "  visiteVirtuelle=" + visiteVirtuelle + ",\n" +
                "  boostReseaux=" + boostReseaux + ",\n" +
                "  dureeMiseEnAvantJours=" + dureeMiseEnAvantJours + ",\n" +
                "  banniereSponsorisee=" + banniereSponsorisee + "\n" +
                "}";
    }
}
