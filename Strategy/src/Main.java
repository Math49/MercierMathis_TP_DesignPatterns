package Strategy.src;

import Strategy.src.context.TarificationService;
import Strategy.src.strategy.FraisLocationStrategy;
import Strategy.src.strategy.FraisVenteStrategy;

public class Main {

    public static void main(String[] args) {

        double montant = 250000;

        TarificationService service = new TarificationService(new FraisVenteStrategy());
        System.out.println("=== Vente ===");
        afficher(service, montant);

        service.setStrategy(new FraisLocationStrategy());
        System.out.println("\n=== Location ===");
        afficher(service, montant);
    }

    private static void afficher(TarificationService service, double montant) {
        System.out.println("Montant transaction : " + montant);
        System.out.println("Frais calculés : " + service.calculer(montant));
    }
}
