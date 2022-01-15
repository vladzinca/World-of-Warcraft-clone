public class CellTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare Cell\n===================");
        Grid grid;
        int length = 5;
        int width = 5;
        grid = Grid.generateMap(5, 5);
        System.out.println("Dupa generarea tablei cu 2 magazine si 4 inamici, tabla de joc este:");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++)
                System.out.print(grid.get(i).get(j) + " ");
            System.out.print("\n");
        }
        Cell cell1 = new Cell(0, 0, true);
        Cell cell2 = new Cell(2, 2, false);
        System.out.println("Pozitia (" + cell1.ox + ", " + cell1.oy + ") este vizitata: " + cell1.visited);
        System.out.println("Pozitia (" + cell2.ox + ", " + cell2.oy + ") este vizitata: " + cell2.visited);
    }
}
