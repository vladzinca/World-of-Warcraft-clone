import java.util.*;

public class SortedArrayList<T> extends ArrayList<T> {
    public void insert(T favGame) {
        add(favGame);
        Comparable<T> comparable = (Comparable<T>) favGame;
        for (int i = size() - 2; i >= 0; i--)
            if (comparable.compareTo(get(i)) < 0)
                Collections.swap(this, i, i + 1);
    }
}