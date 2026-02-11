package FactoryMethod.src;

import FactoryMethod.src.Creator.ContractCreator;
import FactoryMethod.src.Creator.LeaseContractCreator;
import FactoryMethod.src.Creator.SaleContractCreator;

public class Main {

    public static void main(String[] args) {

        ContractCreator leaseGenerator = new LeaseContractCreator();
        leaseGenerator.generate("Camille Martin");

        System.out.println("------------------");

        ContractCreator saleGenerator = new SaleContractCreator();
        saleGenerator.generate("Nadia Benali");
    }
}
