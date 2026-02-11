package FactoryMethod.src.Product;

public class SaleContract implements Contract {

    private final String buyerName;

    public SaleContract(String buyerName) {
        this.buyerName = buyerName;
    }

    @Override
    public String getSummary() {
        return "Contrat de VENTE pour l'acheteur : " + buyerName;
    }
}