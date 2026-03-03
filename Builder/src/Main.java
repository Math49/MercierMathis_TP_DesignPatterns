package Builder.src;

public class Main {

    public static void main(String[] args) {

        RealEstateContractBuilder builder = new RealEstateContractBuilder();
        ContractDirector director = new ContractDirector(builder);

        RealEstateContract lease = director.buildStandardLease("Camille Martin", "APT-742");
        System.out.println(lease);

        RealEstateContract sale = director.buildStandardSale("Nadia Benali", "HSE-105");
        System.out.println(sale);

    }
}