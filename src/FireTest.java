public class FireTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare Fire\n===================");
        Spell fireSpell = new Fire();
        System.out.println("Abilitatea Fire are damage-ul " + fireSpell.damage + " si costa mana " + fireSpell.mana);
    }
}
