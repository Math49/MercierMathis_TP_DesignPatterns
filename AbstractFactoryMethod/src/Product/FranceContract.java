package AbstractFactoryMethod.src.Product;

public class FranceContract implements Contract {

    @Override
    public String getContractType() {
        return "Contrat immobilier conforme au droit français";
    }
}