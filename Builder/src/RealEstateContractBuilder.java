package Builder.src;

import java.util.Objects;

public class RealEstateContractBuilder {

    private RealEstateContract.Type type;
    private String clientName;
    private String propertyRef;

    private Integer monthlyRent;
    private Integer durationMonths;
    private Integer salePrice;
    private String notes;

    // (Optionnel) utile quand le Director réutilise le même builder plusieurs fois
    public RealEstateContractBuilder reset() {
        type = null;
        clientName = null;
        propertyRef = null;
        monthlyRent = null;
        durationMonths = null;
        salePrice = null;
        notes = null;
        return this;
    }

    public RealEstateContractBuilder type(RealEstateContract.Type type) {
        this.type = type;
        return this;
    }

    public RealEstateContractBuilder clientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public RealEstateContractBuilder propertyRef(String propertyRef) {
        this.propertyRef = propertyRef;
        return this;
    }

    public RealEstateContractBuilder monthlyRent(int monthlyRent) {
        this.monthlyRent = monthlyRent;
        return this;
    }

    public RealEstateContractBuilder durationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
        return this;
    }

    public RealEstateContractBuilder salePrice(int salePrice) {
        this.salePrice = salePrice;
        return this;
    }

    public RealEstateContractBuilder notes(String notes) {
        this.notes = notes;
        return this;
    }

    public RealEstateContract build() {
        Objects.requireNonNull(type, "type obligatoire");
        requireText(clientName, "clientName obligatoire");
        requireText(propertyRef, "propertyRef obligatoire");

        // Validation simple selon le type
        if (type == RealEstateContract.Type.LEASE) {
            if (monthlyRent == null) throw new IllegalArgumentException("monthlyRent obligatoire pour LEASE");
            if (durationMonths == null) throw new IllegalArgumentException("durationMonths obligatoire pour LEASE");
        } else { // SALE
            if (salePrice == null) throw new IllegalArgumentException("salePrice obligatoire pour SALE");
        }

        return new RealEstateContract(
                type, clientName, propertyRef,
                monthlyRent, durationMonths,
                salePrice, notes
        );
    }

    private void requireText(String value, String message) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException(message);
    }
}