package Singleton.src;

public class CompanyConfig {

    private static CompanyConfig instance;

    private String country;
    private double vatRate;


    private CompanyConfig() {
        this.country = "France";
        this.vatRate = 0.20;
    }

    public static CompanyConfig getInstance() {
        if (instance == null) {
            instance = new CompanyConfig();
        }
        return instance;
    }

    public String getCountry() {
        return country;
    }

    public double getVatRate() {
        return vatRate;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setVatRate(double vatRate) {
        this.vatRate = vatRate;
    }
}