public class WarriorTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare Warrior\n===================");
        Character warrior = CharacterFactory.makeCharacter(CharacterType.WARRIOR);
        System.out.println("Caracterul " + warrior.name + " este de tip warrior si se afla la pozitia (" + warrior.ox +
                ", " + warrior.oy + ")");
        System.out.println("Are health " + warrior.health + " si mana " + warrior.mana);
        System.out.println("Este imun la fire: " + warrior.fire + ", ice: " + warrior.ice + " si earth: " +
                warrior.earth);
        System.out.println("El are experienta " + warrior.currentExperience + " care il duce la nivelul " +
                warrior.currentLevel);
        System.out.println("Acestea il fac sa aiba strength " + warrior.strength + ", charisma " + warrior.charisma +
                " si dexterity " + warrior.dexterity);
        Enemy enemy = new Enemy();
        Spell spell = new Fire();
        System.out.println("Ii creem un inamic cu health " + enemy.health);
        System.out.println("Folosind abilitatea de foc, " + warrior.name + " il ataca pe inamic, dandu-i damage " +
                warrior.getDamage(spell));
        warrior.useSpell(spell, enemy);
        warrior.accept(spell);
        System.out.println("Acum, inamicul are health-ul " + enemy.health +
                " (inamicul are o sansa de 50% sa nu ia damage)");
        warrior.receiveDamage(10);
        enemy.accept(spell);
        System.out.println("Daca ii dam damage cu un spell de pamant (10) caracterului nostru, atunci va avea viata: " +
                warrior.health + " (nefiind imun la pamant, ia tot damage-ul)");
        System.out.println("Verificam cati bani are in inventar caracterul nostru. Aflam ca are: " +
                warrior.inventory.moneyCount);
        System.out.println("Ii dam 5 bani ca sa poata cumpara o potiune de 5 si o cumparam");
        warrior.inventory.moneyCount = 5;
        Potion potion = new HealthPotion(5, 10, 10);
        warrior.buyPotion(potion);
        System.out.println("Acum caracterul are o potiune in inventar cu pretul " +
                warrior.inventory.potions.get(0).getPrice() + ", valoarea de regenerare " +
                warrior.inventory.potions.get(0).getRegenValue() + " si care cantareste " +
                warrior.inventory.potions.get(0).getWeight());
        warrior.inventory.potions.get(0).regenerate(warrior);
        warrior.inventory.removePotion(potion);
        System.out.println("Folosind-o, ajunge sa aiba din nou health " + warrior.health);
        System.out.println("Insa pentru ca si-a atacat inamicul, caracterul nostru a obosit si are mana "
                + warrior.mana);
        warrior.regenerateMana(1);
        System.out.println("Daca ii regeneram mana cu o unitate, acesta va avea mana " + warrior.mana);
    }
}