import java.util.ArrayList;

public class Warrior extends Character {
    public Warrior(ArrayList<Spell> spells, int health, int maxHealth, int mana, int maxMana, boolean fire, boolean ice,
                   boolean earth, String name, int ox, int oy, Inventory inventory, int currentExperience,
                   int currentLevel, int strength, int charisma, int dexterity) {
        super(spells, health, maxHealth, mana, maxMana, fire, ice, earth, name, ox, oy, inventory, currentExperience,
                currentLevel, strength, charisma, dexterity);
    }

    @Override
    void receiveDamage(int damage) {
        if (damage == 4)
            health -= damage / 2;
        else
            health -= damage;
    }

    @Override
    int getDamage(Spell spell) {
        if (spell.damage == 4)
            return 2 * spell.damage * strength / (50 * currentLevel);
        else
            return spell.damage * strength / (50 * currentLevel);
    }
}