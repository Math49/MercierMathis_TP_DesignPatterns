package Command.src.commands;

import Command.src.model.Annonce;

public class ModifierPrixCommand implements Command {

    private final Annonce annonce;
    private final double nouveauPrix;
    private double ancienPrix;

    public ModifierPrixCommand(Annonce annonce, double nouveauPrix) {
        this.annonce = annonce;
        this.nouveauPrix = nouveauPrix;
    }

    @Override
    public void execute() {
        ancienPrix = annonce.getPrix();
        annonce.setPrix(nouveauPrix);
    }

    @Override
    public void undo() {
        annonce.setPrix(ancienPrix);
    }
}
