public class Cell {
    int ox, oy;

    enum Enum {
        EMPTY,
        ENEMY,
        SHOP,
        FINISH
    }

    CellElement cellelement;
    boolean visited;

    public Cell(int ox, int oy, boolean visited) {
        this.ox = ox;
        this.oy = oy;
        Grid grid = Grid.generateMap(5, 5);
        switch (grid.get(ox).get(oy)) {
            case "S" -> {
                Enum celltype = Enum.SHOP;
                break;
            }
            case "E" -> {
                Enum celltype = Enum.ENEMY;
                break;
            }
            case "F" -> {
                Enum celltype = Enum.FINISH;
                break;
            }
            default -> {
                Enum celltype = Enum.EMPTY;
                break;
            }
        }
        this.visited = visited;
    }
}