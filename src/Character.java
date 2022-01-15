import java.util.ArrayList;

public abstract class Character extends Entity {
    String name;
    int ox, oy;
    //    Inventory inventory;
    int currentExperience, currentLevel;
    //    int strength, charisma, dexterity;

    public Character(ArrayList<Spell> spells, int health, int maxHealth, int mana, int maxMana, boolean fire, boolean ice, boolean earth, String name, int ox, int oy, int currentExperience, int currentLevel) {
        super(spells, health, maxHealth, mana, maxMana, fire, ice, earth);
        this.name = name;
        this.ox = ox;
        this.oy = oy;
        this.currentExperience = currentExperience;
        this.currentLevel = currentLevel;
    }

//    void buyPotion(Inventory inventory) {
//
//    }
}