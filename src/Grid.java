import java.util.ArrayList;

public class Grid extends ArrayList<ArrayList<String>> {
    int length, width;
    String character;
    Cell currentCell;

    private Grid(int length, int width) {
        this.length = length;
        this.width = width;
    }

    private Grid(int length, int width, String character, Cell currentCell) {
        this.length = length;
        this.width = width;
        this.character = character;
        this.currentCell = currentCell;
    }

    static Grid generateMap(int length, int width) {
        Grid grid = new Grid(length, width);
        int shop1Length = (int) (Math.random() * (length));
        int shop1Width = (int) (Math.random() * (width));
        int shop2Length = (int) (Math.random() * (length));
        int shop2Width = (int) (Math.random() * (width));
        while (shop2Length == shop1Length && shop2Width == shop1Width) {
            shop2Length = (int) (Math.random() * (length));
            shop2Width = (int) (Math.random() * (width));
        }
        int enemy1Length = (int) (Math.random() * (length));
        int enemy1Width = (int) (Math.random() * (width));
        while ((enemy1Length == shop1Length && enemy1Width == shop1Width)
                || (enemy1Length == shop2Length && enemy1Width == shop2Width)) {
            enemy1Length = (int) (Math.random() * (length));
            enemy1Width = (int) (Math.random() * (width));
        }
        int enemy2Length = (int) (Math.random() * (length));
        int enemy2Width = (int) (Math.random() * (width));
        while ((enemy2Length == shop1Length && enemy2Width == shop1Width)
                || (enemy2Length == shop2Length && enemy2Width == shop2Width)
                || (enemy2Length == enemy1Length && enemy2Width == enemy1Width)) {
            enemy2Length = (int) (Math.random() * (length));
            enemy2Width = (int) (Math.random() * (width));
        }
        int enemy3Length = (int) (Math.random() * (length));
        int enemy3Width = (int) (Math.random() * (width));
        while ((enemy3Length == shop1Length && enemy3Width == shop1Width)
                || (enemy3Length == shop2Length && enemy3Width == shop2Width)
                || (enemy3Length == enemy1Length && enemy3Width == enemy1Width)
                || (enemy3Length == enemy2Length && enemy3Width == enemy2Width)) {
            enemy3Length = (int) (Math.random() * (length));
            enemy3Width = (int) (Math.random() * (width));
        }
        int enemy4Length = (int) (Math.random() * (length));
        int enemy4Width = (int) (Math.random() * (width));
        while ((enemy4Length == shop1Length && enemy4Width == shop1Width)
                || (enemy4Length == shop2Length && enemy4Width == shop2Width)
                || (enemy4Length == enemy1Length && enemy4Width == enemy1Width)
                || (enemy4Length == enemy2Length && enemy4Width == enemy2Width)
                || (enemy4Length == enemy3Length && enemy4Width == enemy3Width)) {
            enemy4Length = (int) (Math.random() * (length));
            enemy4Width = (int) (Math.random() * (width));
        }
        int finishLength = (int) (Math.random() * (length));
        int finishWidth = (int) (Math.random() * (width));
        while ((finishLength == shop1Length && finishWidth == shop1Width)
                || (finishLength == shop2Length && finishWidth == shop2Width)
                || (finishLength == enemy1Length && finishWidth == enemy1Width)
                || (finishLength == enemy2Length && finishWidth == enemy2Width)
                || (finishLength == enemy3Length && finishWidth == enemy3Width)
                || (finishLength == enemy4Length && finishWidth == enemy4Width)) {
            finishLength = (int) (Math.random() * (length));
            finishWidth = (int) (Math.random() * (width));
        }
        for (int i = 0; i < width; i++) {
            ArrayList<String> arraylist = new ArrayList<>();
            for (int j = 0; j < length; j++)
                if ((i == shop1Width && j == shop1Length) || (i == shop2Width && j == shop2Length))
                    arraylist.add("S");
                else if ((i == enemy1Width && j == enemy1Length) || (i == enemy2Width && j == enemy2Length)
                        || (i == enemy3Width && j == enemy3Length) || (i == enemy4Width && j == enemy4Length))
                    arraylist.add("E");
                else if (i == finishWidth && j == finishLength)
                    arraylist.add("F");
                else
                    arraylist.add("N");
            grid.add(arraylist);
        }
        return grid;
    }

    void goNorth() {
        if (currentCell.oy == 0)
            System.out.println("Cannot go north");
        else {
            currentCell.oy -= 1;
            currentCell.visited = true;
        }
    }

    void goSouth() {
        if (currentCell.oy == width - 1)
            System.out.println("Cannot go south");
        else {
            currentCell.oy += 1;
            currentCell.visited = true;
        }
    }

    void goWest() {
        if (currentCell.ox == 0)
            System.out.println("Cannot go west");
        else {
            currentCell.ox -= 1;
            currentCell.visited = true;
        }
    }

    void goEast() {
        if (currentCell.ox == length - 1)
            System.out.println("Cannot go east");
        else {
            currentCell.ox += 1;
            currentCell.visited = true;
        }
    }
}