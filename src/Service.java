package src;

import java.util.ArrayList;
import java.util.List;

import src.inout.InOut;
import toy.Toy;

public class Service {
    private List<Toy> toys;
    private InOut inOut;

    public Service() {
        this.toys = new ArrayList<Toy>();
        this.inOut = new InOut();
    }

    // public void sortByName() {
    // geoTree.sortByName();
    // }

    // public void sortByAge() {
    // geoTree.sortByAge();
    // }

    // public void fileUpload() {
    // inOut.fileUpload(geoTree);
    // }

    // public GeoTree fileDownload() {
    // return inOut.fileDownload();
    // }

    public int addToy(int id, String name, int quantity, int weight) {
        // if (TypeInfo.getPerson(fullName) == null) {
        // geoTree.addPerson(new Person(fullName, gender, age));
        // return 1;
        // } else {
        // return 0;
        // }
        new Toy(id, name, quantity, weight);
        return 0;
    }

    // public Person getPerson(String fullName) {
    // return geoTree.getPerson(fullName);
    // }

    public List<Toy> getToyList() {
        return toys;
    }

    // public List<Node<Person>> getNodeList() {
    // return geoTree.getNodelist();
    // }

    // public int addNode(String p1, Relationship relation, String p2) {
    // if (getPerson(p1) == null) {
    // return 0;
    // } else if (getPerson(p2) == null) {
    // return 0;
    // } else {
    // geoTree.addNode(new Node<Person>(getPerson(p1), relation, getPerson(p2)));
    // geoTree.addNode(new Node<Person>(getPerson(p2), Relationship.children,
    // getPerson(p1)));
    // return 1;
    // }
    // }

    // public int delPerson(String fullName) {
    // if (getPerson(fullName) == null) {
    // return 0;
    // } else {
    // geoTree.delPerson(getPerson(fullName));
    // return 1;
    // }
    // }

    // public List<Node<Person>> findByPerson(String p1) {
    // return geoTree.findByPerson(getPerson(p1));
    // }
}
