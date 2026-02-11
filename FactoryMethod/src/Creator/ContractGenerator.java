package FactoryMethod.src.Creator;
import FactoryMethod.src.Product.Contract;

public abstract class ContractGenerator {

    protected abstract Contract createContract(String clientName);

    public void generate(String clientName) {
        Contract contract = createContract(clientName);
        System.out.println("Génération du contrat...");
        System.out.println(contract.getSummary());
    }
}

