package src;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import src.inout.InOut;
import src.toy.Toy;

public class Service implements Serializable {
    private List<Toy> toys;
    private List<Toy> prizeToys;
    private InOut inOut;

    public Service() {
        this.toys = new ArrayList<>();
        this.prizeToys = new ArrayList<>();
        this.inOut = new InOut();
    }

    public int maintainToyWeght(int id, int weight) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
                return 1;
            }
        }
        return 0;
    }

    public Toy choosePrizeToys() {
        int weight = getTotalWeight();
        Toy winToy = null;
        if (weight > 0) {
            double randomWeight = (Math.random() * weight) + 1;
            int tempWeight = 0;
            for (Toy toy : toys) {
                tempWeight += toy.getWeight();
                if (tempWeight >= randomWeight) {
                    winToy = new Toy(toy.getId(), toy.getName(), 1, toy.getWeight());
                    prizeToys.add(winToy);
                    toy.setQuantity(toy.getQuantity() - 1);
                    break;
                }
            }
        }
        return winToy;
    }

    public String receivePrizeToys() {
        if (!prizeToys.isEmpty()) {
            Toy t = showPrizeToys().get(0);
            prizeToys.remove(0);
            inOut.fileUpload(t);
            return t.getName();
        }
        return null;
    }

    public int getTotalWeight() {
        int weight = 0;
        for (Toy toy : toys) {
            weight += toy.getWeight();
        }
        return weight;

    }

    public int addToy(int id, String name, int quantity, int weight) {
        for (Toy t : toys) {
            if (t.getId() == id) {
                t.setQuantity(t.getQuantity() + quantity);
                t.setWeight(weight);
                return 2;
            }
        }
        toys.add(new Toy(id, name, quantity, weight));
        return 1;
    }

    public List<Toy> showToys() {
        return toys;
    }

    public List<Toy> showPrizeToys() {
        return prizeToys;
    }
}
