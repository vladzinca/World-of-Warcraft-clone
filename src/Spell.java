public abstract class Spell implements Visitor {
    int damage, mana;

    public Spell(int damage, int mana) {
        this.damage = damage;
        this.mana = mana;
    }

    @Override
    public void visit(Entity entity) {
        System.out.println("Entity dealt spell");
    }
}