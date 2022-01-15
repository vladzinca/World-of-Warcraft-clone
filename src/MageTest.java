public class MageTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare Mage\n===================");
        Character mage = CharacterFactory.makeCharacter(CharacterType.MAGE);
        System.out.println("Caracterul " + mage.name + " este de tip mage si se afla la pozitia (" + mage.ox + ", " + mage.oy + ")");
        System.out.println("Are health " + mage.health + " si mana " + mage.mana);
        System.out.println("Este imun la fire: " + mage.fire + ", ice: " + mage.ice + " si earth: " + mage.earth);
        System.out.println("El are experienta " + mage.currentExperience + " care il duce la nivelul " + mage.currentLevel);
        System.out.println("Acestea il fac sa aiba strength " + mage.strength + ", charisma " + mage.charisma + " si dexterity " + mage.dexterity);
        Enemy enemy = new Enemy();
        Spell spell = new Ice();
        System.out.println("Ii creem un inamic cu health " + enemy.health);
        System.out.println("Folosind abilitatea de gheata, " + mage.name + " il ataca pe inamic, dandu-i damage " + mage.getDamage(spell));
        mage.useSpell(spell, enemy);
        System.out.println("Acum, inamicul are health-ul " + enemy.health + " (inamicul are o sansa de 50% sa nu ia damage)");
        mage.receiveDamage(10);
        System.out.println("Daca ii dam damage cu un spell de pamant (10) caracterului nostru, atunci va avea viata: " + mage.health + " (nefiind imun la pamant, ia tot damage-ul)");
        System.out.println("Verificam cati bani are in inventar caracterul nostru. Aflam ca are: " + mage.inventory.moneyCount);
        System.out.println("Ii dam 5 bani ca sa poata cumpara o potiune de 5 si o cumparam");
        mage.inventory.moneyCount = 5;
        Potion potion = new HealthPotion(5, 10, 10);
        mage.buyPotion(potion);
        System.out.println("Acum caracterul are o potiune in inventar cu pretul " + mage.inventory.potions.get(0).getPrice() + ", valoarea de regenerare " + mage.inventory.potions.get(0).getRegenValue() + " si care cantareste " + mage.inventory.potions.get(0).getWeight());
        mage.inventory.potions.get(0).regenerate(mage);
        mage.inventory.removePotion(potion);
        System.out.println("Folosind-o, ajunge sa aiba din nou health " + mage.health);
        System.out.println("Insa pentru ca si-a atacat inamicul, caracterul nostru a obosit si are mana " + mage.mana);
        mage.regenerateMana(1);
        System.out.println("Daca ii regeneram mana cu o unitate, acesta va avea mana " + mage.mana);
    }
}
