import java.util.ArrayList;

public abstract class Entity implements Element {
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
        enemy.receiveDamage(this.getDamage(spell));
        this.mana -= spell.mana;
    }

    abstract void receiveDamage(int damage);

    abstract int getDamage(Spell spell);

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}