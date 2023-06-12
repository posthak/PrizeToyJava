import src.Service;
import ui.View;

public class Presenter {
    private Service service;
    private View view;

    public Presenter(View view) {
        this.view = view;
        this.service = new Service();
        view.setPresenter(this);
    }

    public void addToy(int id, String name, int quantity, int weight) {
        // if (service.addPerson(fullName, Age, gender) == 1) {
        // view.print("Человек добавлен в дерево!");
        // } else {
        // view.print("Этот человек уже существует в дереве!");
        // }
        service.addToy(id, name, quantity, weight);
    }

    // public void findByPerson(String p1) {
    // view.print(service.findByPerson(p1).toString());
    // }

    // public void addNode(String p1, Relationship re, String p2) {
    // if (service.getPerson(p1) != null && service.getPerson(p2) != null) {
    // if (service.addNode(p1, re, p2) == 1) {
    // view.print("Родственная связь успешно добавлена в дерево!");
    // } else {
    // view.print("Родственная связь не добавлена в дерево!");
    // }
    // } else {
    // view.print("Невозможно добавить связь,сначала добавьте этого человека");
    // }
    // }

    // public void getPersonList() {
    // if (!service.getPersonList().isEmpty()) {
    // view.print(service.getPersonList().toString());
    // } else {
    // view.print("Список людей еще не заполнен");
    // }
    // }

    // public void getNodeList() {
    // if (!service.getNodeList().isEmpty()) {
    // view.print(service.getNodeList().toString());
    // } else {
    // view.print("Дерево еще не заполненно");
    // }
    // }

    // public void delPerson(String fullName) {
    // if (service.delPerson(fullName) == 1) {
    // view.print("Человек удален из списка!");
    // } else {
    // view.print("Этот человек не существует в списке!");
    // }
    // }

    // public void upload() {
    // if (!service.getNodeList().isEmpty()) {
    // service.fileUpload();
    // view.print("Дерево успешно выгружены в файл");
    // } else {
    // view.print("Дерево еще не заполнено");
    // }
    // }

    // public void download() {
    // String answer = service.fileDownload() != null
    // ? "Дерево успешно загружено из файла - " + service.fileDownload().toString()
    // : "Файл не найден";
    // view.print(answer);
    // }
}
