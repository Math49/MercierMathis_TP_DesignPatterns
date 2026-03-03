package Builder.src;

public class ContractDirector {

    private final RealEstateContractBuilder builder;

    public ContractDirector(RealEstateContractBuilder builder) {
        this.builder = builder;
    }

    public RealEstateContract buildStandardLease(String tenantName, String propertyRef) {
        return builder.reset()
                .type(RealEstateContract.Type.LEASE)
                .clientName(tenantName)
                .propertyRef(propertyRef)
                .monthlyRent(750)
                .durationMonths(36)
                .notes("Bail standard")
                .build();
    }

    public RealEstateContract buildStandardSale(String buyerName, String propertyRef) {
        return builder.reset()
                .type(RealEstateContract.Type.SALE)
                .clientName(buyerName)
                .propertyRef(propertyRef)
                .salePrice(215000)
                .notes("Vente standard")
                .build();
    }
}