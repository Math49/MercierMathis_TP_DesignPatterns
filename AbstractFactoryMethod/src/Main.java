package AbstractFactoryMethod.src;

import AbstractFactoryMethod.src.Factories.ContractFactory;
import AbstractFactoryMethod.src.Factories.FranceContractFactory;
import AbstractFactoryMethod.src.Factories.SpainContractFactory;
import AbstractFactoryMethod.src.Product.Contract;
import AbstractFactoryMethod.src.Product.LegalClause;

public class Main {

    public static void main(String[] args) {

        // Choix de la factory (ex: selon pays configuré)
        ContractFactory factory = new FranceContractFactory();
        // ContractFactory factory = new SpainContractFactory();

        Contract contract = factory.createContract();
        LegalClause clause = factory.createLegalClause();

        System.out.println(contract.getContractType());
        System.out.println(clause.getClauseText());
    }
}