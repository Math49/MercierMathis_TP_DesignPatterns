package Adapter.src;

public class Main {

    public static void main(String[] args) {

        OldContractSystem oldSystem = new OldContractSystem();

        // On adapte l'ancien système
        ContractGenerator generator = new OldContractAdapter(oldSystem);

        String contract = generator.generate("Camille Martin");

        System.out.println(contract);
    }
}
