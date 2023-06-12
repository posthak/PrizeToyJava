package src.inout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import toy.Toy;

public class InOut implements InOutable {

    @Override
    public void fileUpload(List<Toy> t) {
        // try (// TODO Auto-generated method stub
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("toy.out"));

            objectOutputStream.writeObject(t);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public List<Toy> fileDownload() {
        // TODO Auto-generated method stub
        List<Toy> gt = null;
        ObjectInputStream objectInputStream;
        try {
            objectInputStream = new ObjectInputStream(
                    new FileInputStream("toy.out"));

            gt = (List<Toy>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            return null;
        }
        return gt;
    }
}