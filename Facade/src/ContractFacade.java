package Facade.src;

public class ContractFacade {

    private final ContractCreationService creationService = new ContractCreationService();
    private final NotificationService notificationService = new NotificationService();
    private final LoggingService loggingService = new LoggingService();

    public void createAndNotify(String client, String property) {
        loggingService.log("Début de création du contrat");
        creationService.validateData(client, property);

        String contractId = creationService.create(client, property);

        loggingService.log("Contrat créé : " + contractId);

        notificationService.sendConfirmation(contractId, client);

        loggingService.log("Fin du processus contractuel");
    }
}
