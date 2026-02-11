package Decorator.src;

public class BaseLeaseContract implements ContractDocument {

    private final String tenantName;
    private final int baseMonthlyPrice;

    public BaseLeaseContract(String tenantName, int baseMonthlyPrice) {
        this.tenantName = tenantName;
        this.baseMonthlyPrice = baseMonthlyPrice;
    }

    @Override
    public String getText() {
        return "Contrat de LOCATION\nLocataire: " + tenantName + "\n";
    }

    @Override
    public int getMonthlyPrice() {
        return baseMonthlyPrice;
    }
}

