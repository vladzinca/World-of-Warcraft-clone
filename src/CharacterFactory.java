import java.util.ArrayList;

public class CharacterFactory {
    public static Character makeCharacter(CharacterType type) {
        Character character = null;
        ArrayList<Spell> spells = new ArrayList<>();
        ArrayList<Potion> potions = new ArrayList<>();
        switch (type) {
            case WARRIOR:
                Inventory inventory1 = new Inventory(potions, 128, 0);
                character = new Warrior(spells, 128, 128, 128, 128, true, false,
                        false, "Jack Spicer", 0, 0, inventory1, 10, 1,
                        50, 10, 10);
                break;
            case MAGE:
                Inventory inventory2 = new Inventory(potions, 64, 16);
                character = new Mage(spells, 128, 128, 128, 128, false, true,
                        false, "Ionel Bratianu", 0, 0, inventory2, 300, 30,
                        300, 1500, 300);
                break;
            case ROGUE:
                Inventory inventory3 = new Inventory(potions, 32, 32);
                character = new Rogue(spells, 128, 128, 128, 128, false, false,
                        true, "Obi-Wan Kenobi", 0, 0, inventory3, 100, 10,
                        100, 100, 500);
                break;
            default:
                throw new IllegalArgumentException("The character type " + type + " is not recognized.");
        }
        return character;
    }
}