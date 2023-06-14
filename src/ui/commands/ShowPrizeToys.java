package src.ui.commands;

import src.ui.Console;

public class ShowPrizeToys extends Command {

    public ShowPrizeToys(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Вывести на экран призовые игрушки";
    }

    @Override
    public void execute() {
        getConsole().showPrizeToys();
    }
}