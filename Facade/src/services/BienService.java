package Facade.src.services;

public class BienService {
    public void verifierBien(String bienId) {
        if (bienId == null || bienId.isBlank()) {
            throw new IllegalArgumentException("Bien invalide.");
        }
        System.out.println("✅ Bien vérifié : " + bienId);
    }
}
