package AbstractFactoryMethod.src.Product;

public class SpainContract implements Contract {

    @Override
    public String getContractType() {
        return "Contrato inmobiliario conforme a la ley española";
    }
}