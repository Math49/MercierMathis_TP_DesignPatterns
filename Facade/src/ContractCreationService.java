package Facade.src;

public class ContractCreationService {

    public void validateData(String client, String property) {
        System.out.println("🔍 Validation des données pour : " + client + ", " + property);
    }

    public String create(String client, String property) {
        String id = client.toUpperCase() + "-" + property;
        System.out.println("📄 Création du contrat avec ID : " + id);
        return id;
    }
}
