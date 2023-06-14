package src;

import src.presenter.Presenter;
import src.ui.Console;
import src.ui.View;

public class Main {
    public static void main(String[] args) {
        View view = new Console();
        new Presenter(view);
        view.start();
    }

}
