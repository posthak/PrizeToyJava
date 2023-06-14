package src.inout;

import java.io.FileWriter;
import java.io.IOException;

import src.toy.Toy;

public class InOut implements InOutable {

    @Override
    public void fileUpload(Toy t) {
        try {
            FileWriter writer = new FileWriter("toy.txt", true);
            writer.write(
                    "Id: " + t.getId() + "; " + "Name: " + t.getName() + "; " + "Quantity: " + t.getQuantity() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи игрушки в файл");
            e.printStackTrace();
        }
    }
}