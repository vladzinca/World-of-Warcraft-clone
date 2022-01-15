import java.util.ArrayList;

public class Cell {
    int ox, oy;

    enum cellType {
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
                cellType celltype = cellType.SHOP;
                break;
            }
            case "E" -> {
                cellType celltype = cellType.ENEMY;
                break;
            }
            case "F" -> {
                cellType celltype = cellType.FINISH;
                break;
            }
            default -> {
                cellType celltype = cellType.EMPTY;
                break;
            }
        }
        this.visited = visited;
    }
}
