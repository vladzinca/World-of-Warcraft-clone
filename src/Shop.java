import java.util.ArrayList;

public class Shop implements CellElement {
    ArrayList<Potion> potions;

    public Shop(ArrayList<Potion> potions) {
        int potionCounter = (int) (Math.random() * 2) + 2;
        for (int i = 0; i < potionCounter; i++) {
            int type = (int) (Math.random() * 2);
            int price = (int) (Math.random() * 15) + 5;
            int regenValue = (int) (Math.random() * 50) + 50;
            int weight = (int) (Math.random() * 30) + 20;

            if (type == 1) {
                Potion potion = new HealthPotion(price, regenValue, weight);
                potions.add(potion);
            } else {
                Potion potion = new ManaPotion(price, regenValue, weight);
                potions.add(potion);
            }
        }
        this.potions = potions;
    }

    public Potion selectPotion(int index, ArrayList<Potion> potions) {
        Potion potion = potions.get(index);
        potions.remove(index);
        return potion;
    }

    @Override
    public String toCharacter() {
        return null;
        // implementeaza
    }
}