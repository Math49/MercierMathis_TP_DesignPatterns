package Facade.src;

public class NotificationService {

    public void sendConfirmation(String contractId, String client) {
        System.out.println("📧 Envoi de la notification à " + client + " pour contrat " + contractId);
    }
}
