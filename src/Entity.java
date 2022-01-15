import java.util.ArrayList;

public abstract class Entity {
    ArrayList<String> abilities;
    int health, maxHealth, mana, maxMana;
    boolean fire, ice, earth;

    public Entity(ArrayList<String> abilities, int health, int maxHealth, int mana, int maxMana, boolean fire, boolean ice, boolean earth) {
        this.abilities = abilities;
        this.health = health;
        this.maxHealth = maxHealth;
        this.mana = mana;
        this.maxMana = maxMana;
        this.fire = fire;
        this.ice = ice;
        this.earth = earth;
    }

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

//    void useAbility(String ability, Entity enemy) {
//
//    }

//    abstract void receiveDamage(int damage);
//
//    abstract void getDamage();
}
