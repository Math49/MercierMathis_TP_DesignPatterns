package Adapter.src;

public class OldContractAdapter implements ContractGenerator {

    private final OldContractSystem oldSystem;

    public OldContractAdapter(OldContractSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public String generate(String clientName) {
        return oldSystem.generateDocument(clientName, "LOCATION");
    }
}