package FactoryMethod.src.Creator;

import FactoryMethod.src.Product.Contract;
import FactoryMethod.src.Product.LeaseContract;

public class LeaseContractGenerator extends ContractGenerator {

    @Override
    protected Contract createContract(String clientName) {
        return new LeaseContract(clientName);
    }
}
