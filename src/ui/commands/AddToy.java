package src.ui.commands;

import src.ui.Console;

public class AddToy extends Command {

    public AddToy(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить игрушку";
    }

    @Override
    public void execute() {
        getConsole().addToy();
    }
}
