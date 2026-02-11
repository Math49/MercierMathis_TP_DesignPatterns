package AbstractFactoryMethod.src.Factories;

import AbstractFactoryMethod.src.Product.Contract;
import AbstractFactoryMethod.src.Product.LegalClause;

public interface ContractFactory {

    Contract createContract();

    LegalClause createLegalClause();
}