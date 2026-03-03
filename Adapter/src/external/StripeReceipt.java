package Adapter.src.external;

public class StripeReceipt {
    private final String id;
    private final boolean paid;
    private final String details;

    public StripeReceipt(String id, boolean paid, String details) {
        this.id = id;
        this.paid = paid;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public boolean isPaid() {
        return paid;
    }

    public String getDetails() {
        return details;
    }
}
