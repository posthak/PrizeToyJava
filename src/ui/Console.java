package src.ui;

import java.util.Scanner;
import src.presenter.Presenter;

public class Console implements View {

    private Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    private boolean work;

    @Override
    public void start() {
        menu = new Menu(this);
        work = true;
        while (work) {
            scanner = new Scanner(System.in);
            hello();
            String command = scanner.nextLine();
            if (checkInput(command)) {
                menu.execute(Integer.parseInt(command));
            } else {
                System.out.println("что-то пошло не так");
            }
        }
    }

    private boolean checkInput(String text) {
        return text.matches("[0-9]+");
    }

    private void hello() {
        System.out.println(menu.printMenu());
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    public void finish() {
        work = false;
    }

    public void addToy() {
        System.out.println("Введите id");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Введите имя игрушки");
        String name = scanner.nextLine();

        System.out.println("Введите количество игрушшек");
        int quantity = scanner.nextInt();

        System.out.println("Введите вес игрушки");
        int weight = scanner.nextInt();

        presenter.addToy(id, name, quantity, weight);

        // presenter.addToy(1, "Конструктор", 2, 20);
        // presenter.addToy(2, "Кубик", 2, 20);
        // presenter.addToy(3, "Робот", 6, 60);
        presenter.showToys();
    }

    public void maintainToyWeght() {

        System.out.println("Введите id: ");
        int id = scanner.nextInt();

        System.out.println("Введите вес игрушки: ");
        int weight = scanner.nextInt();
        presenter.maintainToyWeght(id, weight);
    }

    public void choosePrizeToys() {
        presenter.choosePrizeToys();
    }

    public void showToys() {
        presenter.showToys();
    }

    public void showPrizeToys() {
        presenter.showPrizeToys();
    }

    public void receivePrizeToys() {
        presenter.receivePrizeToys();
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
