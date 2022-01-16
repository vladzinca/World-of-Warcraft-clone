import java.util.ArrayList;

public abstract class Character extends Entity {
    String name;
    int ox, oy;
    Inventory inventory;
    int currentExperience, currentLevel;
    int strength, charisma, dexterity;

    public Character(ArrayList<Spell> spells, int health, int maxHealth, int mana, int maxMana, boolean fire,
                     boolean ice, boolean earth, String name, int ox, int oy, Inventory inventory,
                     int currentExperience, int currentLevel, int strength, int charisma, int dexterity) {
        this.spells = spells;
        this.health = health;
        this.maxHealth = maxHealth;
        this.mana = mana;
        this.maxMana = maxMana;
        this.fire = fire;
        this.ice = ice;
        this.earth = earth;
        this.name = name;
        this.ox = ox;
        this.oy = oy;
        this.inventory = inventory;
        this.currentExperience = currentExperience;
        this.currentLevel = currentLevel;
        this.strength = strength;
        this.charisma = charisma;
        this.dexterity = dexterity;
    }

    void buyPotion(Potion potion) {
        if (inventory.moneyCount >= potion.getPrice() && inventory.calculateWeight() >= potion.getWeight()) {
            this.inventory.addPotion(potion);
        }
    }
}