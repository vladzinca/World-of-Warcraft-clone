public class RogueTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare Rogue\n===================");
        Character rogue = CharacterFactory.makeCharacter(CharacterType.ROGUE);
        System.out.println("Caracterul " + rogue.name + " este de tip rogue si se afla la pozitia (" + rogue.ox + ", " + rogue.oy + ")");
        System.out.println("Are health " + rogue.health + " si mana " + rogue.mana);
        System.out.println("Este imun la fire: " + rogue.fire + ", ice: " + rogue.ice + " si earth: " + rogue.earth);
        System.out.println("El are experienta " + rogue.currentExperience + " care il duce la nivelul " + rogue.currentLevel);
        System.out.println("Acestea il fac sa aiba strength " + rogue.strength + ", charisma " + rogue.charisma + " si dexterity " + rogue.dexterity);
        Enemy enemy = new Enemy();
        Spell spell = new Earth();
        System.out.println("Ii creem un inamic cu health " + enemy.health);
        System.out.println("Folosind abilitatea de pamant, " + rogue.name + " il ataca pe inamic, dandu-i damage " + rogue.getDamage(spell));
        rogue.useSpell(spell, enemy);
        System.out.println("Acum, inamicul are health-ul " + enemy.health + " (inamicul are o sansa de 50% sa nu ia damage)");
        rogue.receiveDamage(10);
        System.out.println("Daca ii dam damage cu un spell de pamant (10) caracterului nostru, atunci va avea viata: " + rogue.health + " (fiind imun la pamant, ia doar jumatate)");
        System.out.println("Verificam cati bani are in inventar caracterul nostru. Aflam ca are: " + rogue.inventory.moneyCount);
        System.out.println("Ii dam 5 bani ca sa poata cumpara o potiune de 5 si o cumparam");
        rogue.inventory.moneyCount = 5;
        Potion potion = new HealthPotion(5, 10, 10);
        rogue.buyPotion(potion);
        System.out.println("Acum caracterul are o potiune in inventar cu pretul " + rogue.inventory.potions.get(0).getPrice() + ", valoarea de regenerare " + rogue.inventory.potions.get(0).getRegenValue() + " si care cantareste " + rogue.inventory.potions.get(0).getWeight());
        rogue.inventory.potions.get(0).regenerate(rogue);
        rogue.inventory.removePotion(potion);
        System.out.println("Folosind-o, ajunge sa aiba din nou health " + rogue.health);
        System.out.println("Insa pentru ca si-a atacat inamicul, caracterul nostru a obosit si are mana " + rogue.mana);
        rogue.regenerateMana(1);
        System.out.println("Daca ii regeneram mana cu o unitate, acesta va avea mana " + rogue.mana);
    }
}
