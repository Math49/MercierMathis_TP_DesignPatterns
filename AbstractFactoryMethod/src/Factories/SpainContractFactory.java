package AbstractFactoryMethod.src.Factories;

import AbstractFactoryMethod.src.Product.Contract;
import AbstractFactoryMethod.src.Product.LegalClause;
import AbstractFactoryMethod.src.Product.SpainClause;
import AbstractFactoryMethod.src.Product.SpainContract;

public class SpainContractFactory implements ContractFactory {

    @Override
    public Contract createContract() {
        return new SpainContract();
    }

    @Override
    public LegalClause createLegalClause() {
        return new SpainClause();
    }
}