package Singleton.src.services;

import Singleton.src.config.ConfigAgence;

public class AnnonceService {

    public double calculerPrixTTC(double prixHT) {
        ConfigAgence config = ConfigAgence.getInstance();
        return prixHT * (1.0 + config.getTauxTVA());
    }
}
