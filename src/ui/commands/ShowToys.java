package src.ui.commands;

import src.ui.Console;

public class ShowToys extends Command {

    public ShowToys(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Вывести на экран игрушки";
    }

    @Override
    public void execute() {
        getConsole().showToys();
    }
}
