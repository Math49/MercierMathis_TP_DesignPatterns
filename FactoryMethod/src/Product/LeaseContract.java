package FactoryMethod.src.Product;

public class LeaseContract implements Contract {

    private final String tenantName;

    public LeaseContract(String tenantName) {
        this.tenantName = tenantName;
    }

    @Override
    public String getSummary() {
        return "Contrat de LOCATION pour le locataire : " + tenantName;
    }
}