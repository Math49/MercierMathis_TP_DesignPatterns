package Facade.src;

public class Main {

    public static void main(String[] args) {
        ContractFacade facade = new ContractFacade();

        facade.createAndNotify("Camille Martin", "APT-742");
    }
}