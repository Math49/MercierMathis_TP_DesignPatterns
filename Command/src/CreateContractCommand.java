package Command.src;

public class CreateContractCommand implements Command {

    private final ContractService service; // receiver
    private final String contractId;

    public CreateContractCommand(ContractService service, String contractId) {
        this.service = service;
        this.contractId = contractId;
    }

    @Override
    public void execute() {
        service.create(contractId);
    }
}
