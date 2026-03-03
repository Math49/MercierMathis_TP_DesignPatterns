package Facade.src.services;

public class ProprietaireService {
    public void verifierProprietaire(String proprietaireId) {
        if (proprietaireId == null || proprietaireId.isBlank()) {
            throw new IllegalArgumentException("Propriétaire invalide.");
        }
        System.out.println("✅ Propriétaire vérifié : " + proprietaireId);
    }
}
