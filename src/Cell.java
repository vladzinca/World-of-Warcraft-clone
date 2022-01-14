public class Cell {
    int ox, oy;
    enum cellType {
        EMPTY,
        ENEMY,
        SHOP,
        FINISH
    }
//    CellElement cellelement;
    boolean visited;

    public Cell(int ox, int oy, boolean visited) { // CellElement cellelement,
        ox = ox;
        oy = oy;
//        this.cellelement = cellelement;
        this.visited = visited;
    }
}
