package model;

import java.util.Comparator;

public class ToyComparator<T extends Toys> implements Comparator <T>{
    @Override
    public int compare(Toys o1, Toys o2) {
        int res = o2.getActionWeight()-o1.getActionWeight();
        if (res == 0) {
            return 0;
        } else {
            return res;
        }
    }
}
