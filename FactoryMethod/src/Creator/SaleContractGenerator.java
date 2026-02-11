package FactoryMethod.src.Creator;

import FactoryMethod.src.Product.Contract;
import FactoryMethod.src.Product.SaleContract;

public class SaleContractGenerator extends ContractGenerator {

    @Override
    protected Contract createContract(String clientName) {
        return new SaleContract(clientName);
    }
}
