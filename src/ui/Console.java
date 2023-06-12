package ui;

import java.util.Scanner;

import presenter.Presenter;

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
        // String fulName;
        // Integer age;
        // Gender gender;

        // System.out.println("Введите имя человека");
        // fulName = scanner.nextLine();

        // System.out.println("Введите возраст человека");
        // age = scanner.nextInt();

        // System.out.println("Введите номер пола 1.Female или 2.Male");
        // if (scanner.nextInt() == 1) {
        // gender = Gender.female;
        // } else {
        // gender = Gender.male;
        // }
        // presenter.addPerson(fulName, gender, age);
        // presenter.getPersonList();
    }

    public void getPersonList() {
        presenter.getPersonList();
    }

    public void getNodeList() {
        presenter.getNodeList();
    }

    public void download() {
        presenter.download();
    }

    public void upload() {
        presenter.upload();
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
