import java.util.ArrayList;

public class Inventory {
    ArrayList<Potion> potions;
    int maxWeight, moneyCount;

    public Inventory(ArrayList<Potion> potions, int maxWeight, int moneyCount) {
        this.potions = potions;
        this.maxWeight = maxWeight;
        this.moneyCount = moneyCount;
    }

    void addPotion(Potion potion) {
        if (moneyCount > potion.getPrice() && maxWeight > calculateWeight() + potion.getWeight()) {
            potions.add(potion);
            moneyCount -= potion.getPrice();
        }
    }

    Potion removePotion(Potion potion) {
        potions.remove(potion);
        return potion;
    }

    int calculateWeight() {
        int weight = 0;
        for (Potion potion : potions) {
            weight += potion.getWeight();
        }
        return weight;
    }
}
