package Builder.src;

public class RealEstateContract {

    public enum Type { LEASE, SALE }

    private final Type type;
    private final String clientName;
    private final String propertyRef;

    private final Integer monthlyRent;
    private final Integer durationMonths;
    private final Integer salePrice;
    private final String notes;

    RealEstateContract(
            Type type,
            String clientName,
            String propertyRef,
            Integer monthlyRent,
            Integer durationMonths,
            Integer salePrice,
            String notes
    ) {
        this.type = type;
        this.clientName = clientName;
        this.propertyRef = propertyRef;
        this.monthlyRent = monthlyRent;
        this.durationMonths = durationMonths;
        this.salePrice = salePrice;
        this.notes = notes;
    }

    public Type getType() { return type; }

    @Override
    public String toString() {
        return "Contract{type=" + type +
                ", client='" + clientName + '\'' +
                ", propertyRef='" + propertyRef + '\'' +
                ", monthlyRent=" + monthlyRent +
                ", durationMonths=" + durationMonths +
                ", salePrice=" + salePrice +
                ", notes='" + notes + '\'' +
                '}';
    }
}