public class GridTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare Grid\n===================");
        Grid grid;
        int length = 5;
        int width = 5;
        grid = Grid.generateMap(length, width);
        System.out.println("Dupa generarea tablei cu 2 magazine si 4 inamici, tabla de joc este:");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++)
                System.out.print(grid.get(i).get(j) + " ");
            System.out.print("\n");
        }
        grid.currentCell = new Cell(0, 0, true);
        System.out.println("La pozitia (" + grid.currentCell.ox + ", " + grid.currentCell.oy + "), daca mergem la nord ajungem la: ");
        grid.goNorth();
        System.out.println("(" + grid.currentCell.ox + ", " + grid.currentCell.oy + ")");
        System.out.println("La pozitia (" + grid.currentCell.ox + ", " + grid.currentCell.oy + "), daca mergem la sud ajungem la: ");
        grid.goSouth();
        System.out.println("(" + grid.currentCell.ox + ", " + grid.currentCell.oy + ")");
        System.out.println("La pozitia (" + grid.currentCell.ox + ", " + grid.currentCell.oy + "), daca mergem la vest ajungem la: ");
        grid.goWest();
        System.out.println("(" + grid.currentCell.ox + ", " + grid.currentCell.oy + ")");
        System.out.println("La pozitia (" + grid.currentCell.ox + ", " + grid.currentCell.oy + "), daca mergem la est ajungem la: ");
        grid.goEast();
        System.out.println("(" + grid.currentCell.ox + ", " + grid.currentCell.oy + ")");
    }
}
