package Command.src;

public class Main {

    public static void main(String[] args) {

        ContractService service = new ContractService();
        CommandQueue invoker = new CommandQueue();

        Command create = new CreateContractCommand(service, "LEASE-APT-742");
        Command cancel = new CancelContractCommand(service, "LEASE-APT-742");

        invoker.run(create);
        invoker.run(cancel);

        System.out.println("Historique (nb commandes exécutées) = " + invoker.historySize());
    }
}
