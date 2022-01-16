public class GameTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare Game\n===================");
        System.out.println("Instantiem un obiect de tip Game folosind singleton cu instantiere intarziata");
        Game game = Game.getInstance();
    }
}