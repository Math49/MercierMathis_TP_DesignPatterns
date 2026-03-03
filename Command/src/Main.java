package Command.src;

import Command.src.commands.ModifierPrixCommand;
import Command.src.invoker.CommandManager;
import Command.src.model.Annonce;

public class Main {

    public static void main(String[] args) {

        Annonce annonce = new Annonce("T3 centre-ville", 250000);
        CommandManager manager = new CommandManager();

        System.out.println("Prix initial : " + annonce.getPrix());

        manager.executeCommand(new ModifierPrixCommand(annonce, 240000));
        System.out.println("Après modification : " + annonce.getPrix());

        manager.undoLast();
        System.out.println("Après undo : " + annonce.getPrix());
    }
}
