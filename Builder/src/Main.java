package Builder.src;

import Builder.src.director.AnnonceDirector;
import Builder.src.product.AnnoncePremium;
import Builder.src.builder.AnnoncePremiumBuilder;

public class Main {
    public static void main(String[] args) {
        AnnonceDirector director = new AnnonceDirector();

        AnnoncePremium standard = director.packStandard("Studio proche gare", 98000);
        AnnoncePremium premium = director.packPremium("Maison familiale 140m2", 265000);
        AnnoncePremium ultra = director.packUltra("Villa luxe bord de mer", 1250000);

        System.out.println("=== STANDARD ===");
        System.out.println(standard.resume());
        System.out.println();

        System.out.println("=== PREMIUM ===");
        System.out.println(premium.resume());
        System.out.println();

        System.out.println("=== ULTRA ===");
        System.out.println(ultra.resume());
        System.out.println();

    }
}