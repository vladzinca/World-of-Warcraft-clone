import java.util.ArrayList;

public class Rogue extends Character {
    public Rogue(ArrayList<Spell> spells, int health, int maxHealth, int mana, int maxMana, boolean fire, boolean ice, boolean earth, String name, int ox, int oy, Inventory inventory, int currentExperience, int currentLevel, int strength, int charisma, int dexterity) {
        super(spells, health, maxHealth, mana, maxMana, fire, ice, earth, name, ox, oy, inventory, currentExperience, currentLevel, strength, charisma, dexterity);
    }

    @Override
    void receiveDamage(int damage) {
        if (damage == 10)
            health -= damage / 2;
        else
            health -= damage;
    }

    @Override
    int getDamage(Spell spell) {
        if (spell.damage == 10)
            return 2 * spell.damage * dexterity / (50 * currentLevel);
        else
            return spell.damage * dexterity / (50 * currentLevel);
    }
}
