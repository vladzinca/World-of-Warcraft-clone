import java.util.*;

public class Game {
    List<Account> accounts;
    Map<Cell.Enum, List<String>> stories;

    private static volatile Game game = null;

    private Game() {
    }

    public static Game getInstance() {
        if (game == null) {
            synchronized (Game.class) {
                if (game == null) {
                    game = new Game();
                }
            }
        }
        return game;
    }
}