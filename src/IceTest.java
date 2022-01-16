public class IceTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare Ice\n===================");
        Spell iceSpell = new Ice();
        System.out.println("Abilitatea Ice are damage-ul " + iceSpell.damage + " si costa mana " + iceSpell.mana);
    }
}