package Facade.src.services;

public class ContratService {
    public String genererContratVente(String proprietaireId, String bienId, double prixVente, double commission) {
        String contrat = "Contrat de vente\n" +
                "Propriétaire: " + proprietaireId + "\n" +
                "Bien: " + bienId + "\n" +
                "Prix: " + prixVente + "\n" +
                "Commission: " + commission + "\n";
        System.out.println("✅ Contrat généré");
        return contrat;
    }
}
