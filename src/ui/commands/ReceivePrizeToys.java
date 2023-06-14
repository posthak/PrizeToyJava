package src.ui.commands;

import src.ui.Console;

public class ReceivePrizeToys extends Command {

    public ReceivePrizeToys(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Получение призовой игрушки";
    }

    @Override
    public void execute() {
        getConsole().receivePrizeToys();
    }
}
