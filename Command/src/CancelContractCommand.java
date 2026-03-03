package Command.src;

public class CancelContractCommand implements Command {

    private final ContractService service; // receiver
    private final String contractId;

    public CancelContractCommand(ContractService service, String contractId) {
        this.service = service;
        this.contractId = contractId;
    }

    @Override
    public void execute() {
        service.cancel(contractId);
    }
}