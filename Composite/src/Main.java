package Composite.src;

public class Main {

    public static void main(String[] args) {

        // Feuilles
        DocumentItem lease = new ContractFile("Contrat de location - APT-742", 12);
        DocumentItem sale  = new ContractFile("Contrat de vente - HSE-105", 18);

        // Dossier principal
        ContractFolder root = new ContractFolder("Dossier client - Martin");

        // Sous-dossier
        ContractFolder annexes = new ContractFolder("Annexes");
        annexes.add(new ContractFile("Diagnostic énergétique", 6));
        annexes.add(new ContractFile("État des lieux", 9));

        root.add(lease);
        root.add(sale);
        root.add(annexes);

        // Traitement uniforme : on appelle sur la racine
        root.print("");
        System.out.println("Total pages = " + root.getTotalPages());
    }
}
