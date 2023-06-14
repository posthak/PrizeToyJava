package src.ui.commands;

import src.ui.Console;

public class СhoosePrizeToys extends Command {

    public СhoosePrizeToys(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Розыгрыш игрушек";
    }

    @Override
    public void execute() {
        getConsole().choosePrizeToys();
    }
}
