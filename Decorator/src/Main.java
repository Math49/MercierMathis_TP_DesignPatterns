package Decorator.src;

public class Main {

    public static void main(String[] args) {

        // Contrat de base
        ContractDocument contract = new BaseLeaseContract("Camille Martin", 750);

        // Ajout d'options (decorators)
        contract = new FurnishedOption(contract);
        contract = new ParkingOption(contract);
        contract = new GardenOption(contract);

        System.out.println(contract.getText());
        System.out.println("Prix mensuel: " + contract.getMonthlyPrice() + " €");
    }
}

