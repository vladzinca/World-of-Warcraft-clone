import java.util.ArrayList;

public class ShopTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare Shop\n===================");
        ArrayList<Potion> potions = new ArrayList<>();
        Shop shop = new Shop(potions);
        System.out.println("Un magazin nou instantiat, identificat pe grid prin " + shop.toCharacter() +
                ", contine urmatoarele potiuni: ");
        for (int i = 0; i < shop.potions.size(); i++)
            System.out.println("Potiunea " + shop.potions.get(i).getType() + " are pretul " +
                    shop.potions.get(i).getPrice() + ", valoarea de regenerare " + shop.potions.get(i).getRegenValue() +
                    " si cantareste " + shop.potions.get(i).getWeight());
        System.out.println();
        shop.selectPotion(0, potions);
        System.out.println("Daca selectam prima potiune, ca si cand am cumpara-o, atunci shop-ul arata astfel:");
        for (int i = 0; i < shop.potions.size(); i++)
            System.out.println("Potiunea " + shop.potions.get(i).getType() + " are pretul " +
                    shop.potions.get(i).getPrice() + ", valoarea de regenerare " + shop.potions.get(i).getRegenValue() +
                    " si cantareste " + shop.potions.get(i).getWeight());
        System.out.println();
        Character warrior = CharacterFactory.makeCharacter(CharacterType.WARRIOR);
        warrior.inventory.moneyCount = 100;
        warrior.buyPotion(shop.selectPotion(0, potions));
        System.out.println("Daca instantiem un caracter, ii dam bani si il facem sa cumpere prima potiune ramasa, " +
                "atunci in shop raman potiunile: ");
        for (int i = 0; i < shop.potions.size(); i++)
            System.out.println("Potiunea " + shop.potions.get(i).getType() + " are pretul " +
                    shop.potions.get(i).getPrice() + ", valoarea de regenerare " +
                    shop.potions.get(i).getRegenValue() + " si cantareste " +
                    shop.potions.get(i).getWeight());
        System.out.println();
        System.out.println("Iar in inventarul caracterului sunt urmatoarele potiuni (inainte nu era nimic):");
        for (int i = 0; i < warrior.inventory.potions.size(); i++)
            System.out.println("Potiunea " + warrior.inventory.potions.get(i).getType() + " are pretul " +
                    warrior.inventory.potions.get(i).getPrice() + ", valoarea de regenerare " +
                    warrior.inventory.potions.get(i).getRegenValue() + " si cantareste " +
                    warrior.inventory.potions.get(i).getWeight());
    }
}