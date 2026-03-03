package Command.src;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue {

    private final List<Command> history = new ArrayList<>();

    public void run(Command command) {
        command.execute();
        history.add(command);
    }

    public int historySize() {
        return history.size();
    }
}
