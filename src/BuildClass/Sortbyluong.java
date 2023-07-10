package BuildClass;

import java.util.Comparator;

public class Sortbyluong implements Comparator {
    public int compare(Staff a, Staff b) {
        return (int) (a.luong() - b.luong());
    }
}