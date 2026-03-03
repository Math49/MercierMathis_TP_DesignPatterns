package Observer.src;

import Observer.src.model.Annonce;
import Observer.src.observers.CRMService;
import Observer.src.observers.NotificationService;
import Observer.src.observers.StatistiquesService;

public class Main {

    public static void main(String[] args) {

        Annonce annonce = new Annonce("T3 centre-ville", 250000);

        annonce.attach(new NotificationService());
        annonce.attach(new CRMService());
        annonce.attach(new StatistiquesService());

        System.out.println("=== Modification du prix ===");
        annonce.setPrix(240000);
    }
}
