package Facade.src.facade;

import Facade.src.model.DossierVente;
import Facade.src.services.*;

public class DossierVenteFacade {

    private final ProprietaireService proprietaireService = new ProprietaireService();
    private final BienService bienService = new BienService();
    private final CommissionService commissionService = new CommissionService();
    private final ContratService contratService = new ContratService();
    private final NotificationService notificationService = new NotificationService();
    private final ArchiveService archiveService = new ArchiveService();

    public DossierVente creerDossierVente(String proprietaireId, String bienId, double prixVente) {
        proprietaireService.verifierProprietaire(proprietaireId);
        bienService.verifierBien(bienId);

        double commission = commissionService.calculerCommission(prixVente);
        String contrat = contratService.genererContratVente(proprietaireId, bienId, prixVente, commission);

        notificationService.envoyerEmailConfirmation(proprietaireId, contrat);
        archiveService.archiverDocument("contrat_" + bienId + ".txt", contrat);

        return new DossierVente(proprietaireId, bienId, prixVente, commission, contrat);
    }
}
