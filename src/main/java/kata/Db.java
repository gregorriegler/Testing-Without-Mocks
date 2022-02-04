package kata;

import java.util.ArrayList;
import java.util.List;

public class Db {
    private final static List<Object> objects = new ArrayList<>();

    public static void persist(Object object) {
        objects.add(object);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<Object> findAll() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return objects;
    }

    public static void clear() {
        objects.clear();
    }
}
