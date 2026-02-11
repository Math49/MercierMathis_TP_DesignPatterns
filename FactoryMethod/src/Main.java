package FactoryMethod.src;

import FactoryMethod.src.Creator.ContractGenerator;
import FactoryMethod.src.Creator.LeaseContractGenerator;
import FactoryMethod.src.Creator.SaleContractGenerator;

public class Main {

    public static void main(String[] args) {

        ContractGenerator leaseGenerator = new LeaseContractGenerator();
        leaseGenerator.generate("Camille Martin");

        System.out.println("------------------");

        ContractGenerator saleGenerator = new SaleContractGenerator();
        saleGenerator.generate("Nadia Benali");
    }
}
