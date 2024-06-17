package qltour.managedata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class IO {

    public <T> void saveData(ArrayList<T> list, String url) {
        try {
            FileOutputStream fos = new FileOutputStream(url);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);

        } catch (IOException e) {
            e.getMessage();
        }
    }

    public <T> ArrayList<T> loadData(ArrayList<T> list, String url) {
        try {
            FileInputStream fis = new FileInputStream(url);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList<T>) ois.readObject();
            return list;
        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
        }
        return list;
    }
}
