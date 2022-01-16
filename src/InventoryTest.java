import java.util.ArrayList;

public class InventoryTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare Inventory\n===================");
        System.out.println("Instantiem un inventar gol:");
        ArrayList<Potion> potions = new ArrayList<>();
        Inventory inventory = new Inventory(potions, 100, 100);
        System.out.println("Inventarul, fiind gol, are potiunile:");
        for (int i = 0; i < inventory.potions.size(); i++)
            System.out.println("Potiunea " + inventory.potions.get(i).getType() + " are pretul " + inventory.potions.get(i).getPrice() + ", valoarea de regenerare " + inventory.potions.get(i).getRegenValue() + " si cantareste " + inventory.potions.get(i).getWeight());
        System.out.println();
        System.out.println("Instantiem 3 potiuni si le adaugam inventarului. Acum inventarul are potiunile:");
        Potion potion1 = new HealthPotion(5, 10, 10);
        Potion potion2 = new ManaPotion(5, 10, 10);
        Potion potion3 = new HealthPotion(20, 128, 30);
        inventory.addPotion(potion1);
        inventory.addPotion(potion2);
        inventory.addPotion(potion3);
        for (int i = 0; i < inventory.potions.size(); i++)
            System.out.println("Potiunea " + inventory.potions.get(i).getType() + " are pretul " + inventory.potions.get(i).getPrice() + ", valoarea de regenerare " + inventory.potions.get(i).getRegenValue() + " si cantareste " + inventory.potions.get(i).getWeight());
        System.out.println();
        System.out.println("Calculand greutatea disponibila, libera a inventarului, aflam ca este: " + inventory.calculateWeight());
        System.out.println();
        inventory.removePotion(inventory.potions.get(inventory.potions.size() - 1));
        System.out.println("Scoatem ultima potiune din inventar. Acum inventarul are potiunile:");
        for (int i = 0; i < inventory.potions.size(); i++)
            System.out.println("Potiunea " + inventory.potions.get(i).getType() + " are pretul " + inventory.potions.get(i).getPrice() + ", valoarea de regenerare " + inventory.potions.get(i).getRegenValue() + " si cantareste " + inventory.potions.get(i).getWeight());
        System.out.println();
        System.out.println("Acum ca am vandut o potiune, greutate a crescut, si este: " + inventory.calculateWeight());
    }
}
