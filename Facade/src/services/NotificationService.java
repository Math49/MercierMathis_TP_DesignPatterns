package Facade.src.services;

public class NotificationService {
    public void envoyerEmailConfirmation(String proprietaireId, String contenu) {
        System.out.println("📩 Email envoyé à " + proprietaireId + " (confirmation dossier)");
    }
}
