import java.util.ArrayList;

public abstract class Character extends Entity {
    String name;
    int ox, oy;
    Inventory inventory;
    int currentExperience, currentLevel;
    int strength, charisma, dexterity;

    public Character(ArrayList<Spell> spells, int health, int maxHealth, int mana, int maxMana, boolean fire, boolean ice, boolean earth, String name, int ox, int oy, Inventory inventory, int currentExperience, int currentLevel, int strength, int charisma, int dexterity) {
        super(spells, health, maxHealth, mana, maxMana, fire, ice, earth);
        this.name = name;
        this.ox = ox;
        this.oy = oy;
        this.inventory = inventory;
        this.currentExperience = currentExperience;
        this.currentLevel = currentLevel;
        this.strength = strength; // implementeaza
        this.charisma = charisma; // implementeaza
        this.dexterity = dexterity; // implementeaza
    }

    void buyPotion(Potion potion) {
        if (inventory.moneyCount > potion.getPrice() && inventory.maxWeight > inventory.calculateWeight() + potion.getWeight()) {
            inventory.addPotion(potion);
        }
    }
}