public class EarthTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare Earth\n===================");
        Spell earthSpell = new Earth();
        System.out.println("Abilitatea Earth are damage-ul " + earthSpell.damage + " si costa mana " + earthSpell.mana);
    }
}