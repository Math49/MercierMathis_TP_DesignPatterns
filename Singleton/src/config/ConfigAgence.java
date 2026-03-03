package Singleton.src.config;

public final class ConfigAgence {

    private static ConfigAgence instance;

    private final String nomAgence;
    private final String devise;
    private final double tauxTVA;

    private ConfigAgence() {
        this.nomAgence = "ImmoZen";
        this.devise = "EUR";
        this.tauxTVA = 0.20;
    }

    public static synchronized ConfigAgence getInstance() {
        if (instance == null) {
            instance = new ConfigAgence();
        }
        return instance;
    }

    public String getNomAgence() {
        return nomAgence;
    }

    public String getDevise() {
        return devise;
    }

    public double getTauxTVA() {
        return tauxTVA;
    }
}