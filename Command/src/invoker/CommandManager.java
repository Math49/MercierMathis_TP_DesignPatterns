package Command.src.invoker;

import Command.src.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {

    private final List<Command> history = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        history.add(command);
    }

    public void undoLast() {
        if (!history.isEmpty()) {
            Command last = history.remove(history.size() - 1);
            last.undo();
        }
    }
}