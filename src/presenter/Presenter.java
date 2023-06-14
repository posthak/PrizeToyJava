package src.presenter;

import src.Service;
import src.ui.View;

public class Presenter {
    private Service service;
    private View view;

    public Presenter(View view) {
        this.view = view;
        this.service = new Service();
        view.setPresenter(this);
    }

    public void addToy(int id, String name, int quantity, int weight) {
        int i = service.addToy(id, name, quantity, weight);
        if (i == 2) {
            view.print("Игрушка обновлена!\n");
        }
        if (i == 1) {
            view.print("Игрушка добавлена!\n");
        }
    }

    public void choosePrizeToys() {
        if (service.showToys().isEmpty()) {
            view.print("Нет игрушек для розыгрыша, сначала добавьте их!\n");
        } else {
            view.print("Призовая игрушка выбрана: ");
            view.print(service.choosePrizeToys().getName());
        }
    }

    public void receivePrizeToys() {
        if (service.showPrizeToys().isEmpty()) {
            view.print("Призовых игрушек для выдачи нет!\n");
        } else {
            view.print("Призовая игрушка получена: ");
            view.print(service.receivePrizeToys().toString());
        }
    }

    public void maintainToyWeght(int id, int weight) {
        if (service.maintainToyWeght(id, weight) == 1) {
            view.print("Игрушка успешно изменена!\n");
        } else {
            view.print("Игрушка не найдена!\n");
        }
    }

    public void showToys() {
        if (service.showToys().isEmpty()) {
            view.print("Игрушки еще не добавлены!\n");
        } else {
            view.print("Список игрушек: ");
            view.print(service.showToys().toString());
        }
    }

    public void showPrizeToys() {
        if (service.showPrizeToys().isEmpty()) {
            view.print("Призовых игрушек нет!\n");
        } else {
            view.print("Список призовых игрушек: ");
            view.print(service.showPrizeToys().toString());
        }
    }
}
