package AbstractFactoryMethod.src.Factories;

import AbstractFactoryMethod.src.Product.Contract;
import AbstractFactoryMethod.src.Product.FranceClause;
import AbstractFactoryMethod.src.Product.FranceContract;
import AbstractFactoryMethod.src.Product.LegalClause;

public class FranceContractFactory implements ContractFactory {

    @Override
    public Contract createContract() {
        return new FranceContract();
    }

    @Override
    public LegalClause createLegalClause() {
        return new FranceClause();
    }
}