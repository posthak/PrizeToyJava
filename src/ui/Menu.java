package src.ui;

import java.util.ArrayList;
import java.util.List;

import src.ui.Console;
import src.ui.commands.AddToy;
import src.ui.commands.Exit;
import src.ui.commands.MaintainToyWeght;
import src.ui.commands.Option;
import src.ui.commands.ReceivePrizeToys;
import src.ui.commands.ShowPrizeToys;
import src.ui.commands.ShowToys;
import src.ui.commands.СhoosePrizeToys;

public class Menu {
    private List<Option> commands;
    private Console console;

    public Menu(Console console) {
        this.console = console;
        commands = new ArrayList<>();
        commands.add(new AddToy(console));
        commands.add(new MaintainToyWeght(console));
        commands.add(new СhoosePrizeToys(console));
        commands.add(new ReceivePrizeToys(console));
        commands.add(new ShowToys(console));
        commands.add(new ShowPrizeToys(console));
        commands.add(new Exit(console));
    }

    void execute(int num) {
        Option option = commands.get(num - 1);
        option.execute();
    }

    public String printMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(": ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
