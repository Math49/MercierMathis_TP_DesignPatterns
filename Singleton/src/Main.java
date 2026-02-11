package Singleton.src;

public class Main {

    public static void main(String[] args) {

        CompanyConfig config1 = CompanyConfig.getInstance();
        CompanyConfig config2 = CompanyConfig.getInstance();

        config1.setCountry("Espagne");

        System.out.println("Config1 pays : " + config1.getCountry());
        System.out.println("Config2 pays : " + config2.getCountry());

        System.out.println("Même instance ? " + (config1 == config2));
    }
}

