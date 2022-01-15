import java.util.ArrayList;

public abstract class Entity {
    ArrayList<Spell> spells;
    int health, maxHealth, mana, maxMana;
    boolean fire, ice, earth;

    void regenerateHealth(int additionalHealth) {
        if (this.health + additionalHealth > this.maxHealth)
            this.health = maxHealth;
        else
            this.health += additionalHealth;
    }

    void regenerateMana(int additionalMana) {
        if (this.mana + additionalMana > this.maxMana)
            this.mana = maxMana;
        else
            this.mana += additionalMana;
    }

    void useSpell(Spell spell, Entity enemy) {
        enemy.receiveDamage(this.getDamage());
    }

    abstract void receiveDamage(int damage);

    abstract int getDamage();
}
