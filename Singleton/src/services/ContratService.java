package Singleton.src.services;

import Singleton.src.config.ConfigAgence;

public class ContratService {

    public String genererEnteteContrat() {
        ConfigAgence config = ConfigAgence.getInstance();
        return "Contrat - " + config.getNomAgence() + " (" + config.getDevise() + ")";
    }
}
