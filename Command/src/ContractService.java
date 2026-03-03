package Command.src;

import java.util.HashSet;
import java.util.Set;

public class ContractService {

    private final Set<String> activeContracts = new HashSet<>();

    public void create(String contractId) {
        activeContracts.add(contractId);
        System.out.println("✅ Contrat créé : " + contractId);
    }

    public void cancel(String contractId) {
        if (activeContracts.remove(contractId)) {
            System.out.println("🛑 Contrat annulé : " + contractId);
        } else {
            System.out.println("⚠️ Impossible d'annuler (inexistant) : " + contractId);
        }
    }
}
