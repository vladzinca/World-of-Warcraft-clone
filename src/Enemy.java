import java.util.ArrayList;

public class Enemy extends Entity implements CellElement {
    public Enemy() {
        ArrayList<Spell> spells = new ArrayList<>();
        int spellCounter = (int) (Math.random() * 2) + 2;
        for (int i = 0; i < spellCounter; i++) {
            int type = (int) (Math.random() * 3);
            if (type == 0) {
                Spell spell = new Fire();
                spells.add(spell);
            } else if (type == 1) {
                Spell spell = new Earth();
                spells.add(spell);
            } else {
                Spell spell = new Ice();
                spells.add(spell);
            }
        }
        this.spells = spells;
        this.health = (int) (Math.random() * 14) + 20;
        this.maxHealth = this.health;
        this.mana = (int) (Math.random() * 14) + 20;
        this.maxMana = this.mana;
        int fire = (int) (Math.random() * 2);
        if (fire == 1)
            this.fire = true;
        else
            this.fire = false;
        int ice = (int) (Math.random() * 2);
        if (ice == 1)
            this.ice = true;
        else
            this.ice = false;
        int earth = (int) (Math.random() * 2);
        if (earth == 1)
            this.earth = true;
        else
            this.earth = false;
    }

    @Override
    public String toCharacter() {
        return null; // implementeaza
    }

    @Override
    void receiveDamage(int damage) {
        int chance = (int) (Math.random() * 2);
        if (chance == 1)
            health -= damage;
        if (health < 0)
            health = 0;
    }

    @Override
    int getDamage(Spell spell) {
        int maxDamage = 0, maxSpellIndex = -1;
        for (int i = 0; i < spells.size(); i++)
            if (spells.get(i).damage > maxDamage && spells.get(i).mana < this.mana) {
                maxDamage = spells.get(i).damage;
                maxSpellIndex = i;
            }
        spells.remove(maxSpellIndex);
        return maxDamage;
    }
}
