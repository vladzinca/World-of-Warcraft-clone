public class HealthPotionTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare HealthPotion\n===================");
        Potion potion1 = new HealthPotion(10, 15, 10);
        System.out.println("Am instantiat o potiune cu pretul " + potion1.getPrice() + ", valoarea de regenerare " + potion1.getRegenValue() + " si care cantareste " + potion1.getWeight());
        Character warrior = CharacterFactory.makeCharacter(CharacterType.WARRIOR);
        System.out.println("Am instantiat un caracter cu viata " + warrior.health + " si viata maxima " + warrior.maxHealth);
        warrior.receiveDamage(10);
        System.out.println("Ii dam damage 10. Acum are viata " + warrior.health);
        potion1.regenerate(warrior);
        System.out.println("Daca ii aplicam potiunea caracterului, atunci va avea viata " + warrior.health);
        System.out.println("Instantiem o noua potiune identica ");
        Potion potion2 = new HealthPotion(10, 15, 10);
        warrior.receiveDamage(20);
        System.out.println("Ii dam damage 20 caracterului. Acum are viata " + warrior.health);
        potion2.regenerate(warrior);
        System.out.println("Daca ii aplicam potiunea caracterului, atunci va avea viata " + warrior.health);
    }
}
