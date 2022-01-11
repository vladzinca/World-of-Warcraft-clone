public class Cell {
    int Ox, Oy;
    enum cellType {
        EMPTY,
        ENEMY,
        SHOP,
        FINISH
    }
    CellElement cellelement;
    boolean visited;
}
