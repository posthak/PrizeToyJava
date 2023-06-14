package src.ui.commands;

import src.ui.Console;

public class MaintainToyWeght extends Command {

    public MaintainToyWeght(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Изменить вес игрушки";
    }

    @Override
    public void execute() {
        getConsole().maintainToyWeght();
    }
}
