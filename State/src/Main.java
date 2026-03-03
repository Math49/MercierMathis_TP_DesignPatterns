package State.src;

import State.src.model.Annonce;

public class Main {

    public static void main(String[] args) {

        Annonce annonce = new Annonce("T3 centre-ville", 250000);

        annonce.modifierPrix(240000);
        annonce.publier();
        annonce.modifierPrix(230000);
        annonce.archiver();
        annonce.modifierPrix(220000); // interdit
    }
}
