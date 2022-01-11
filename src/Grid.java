import java.util.ArrayList;

public class Grid extends ArrayList<ArrayList<String>> {
    int length, width;
    String character;
    Cell currentCell;

    void generateMap(int length, int width) {
        for (int i = 0; i < width; i++)
        {
            ArrayList<String> arraylist = new ArrayList<>();
            for (int j = 0; j < length; j++)
                arraylist.add("merge");
            this.add(arraylist);
        }
    }
}

class Test1 {
    public static void main(String[] args) {
        Grid grid = new Grid();
        int length = 10;
        int width = 10;
        grid.generateMap(length, width);
        System.out.println(grid.get(9).get(5));
    }
}