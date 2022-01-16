public class ManaPotionTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare ManaPotion\n===================");
        Potion potion1 = new ManaPotion(10, 15, 10);
        System.out.println("Am instantiat o potiune cu pretul " + potion1.getPrice() + ", valoarea de regenerare " + potion1.getRegenValue() + " si care cantareste " + potion1.getWeight());
        Character warrior = CharacterFactory.makeCharacter(CharacterType.WARRIOR);
        System.out.println("Am instantiat un caracter cu mana " + warrior.mana + " si mana maxima " + warrior.maxMana);
        warrior.mana = 118;
        System.out.println("Ii setam mana la 118. Acum are mana " + warrior.mana);
        potion1.regenerate(warrior);
        System.out.println("Daca ii aplicam potiunea caracterului, atunci va avea mana " + warrior.mana);
        System.out.println("Instantiem o noua potiune identica ");
        Potion potion2 = new ManaPotion(10, 15, 10);
        warrior.mana = 108;
        System.out.println("Ii setam mana la 108 caracterului. Acum are mana " + warrior.mana);
        potion2.regenerate(warrior);
        System.out.println("Daca ii aplicam potiunea caracterului, atunci va avea mana " + warrior.mana);
    }
}
