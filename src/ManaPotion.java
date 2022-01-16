public class ManaPotion implements Potion {
    int price, regenValue, weight;

    public ManaPotion(int price, int regenValue, int weight) {
        this.price = price;
        this.regenValue = regenValue;
        this.weight = weight;
    }

    @Override
    public void regenerate(Entity entity) {
        entity.regenerateMana(regenValue);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getRegenValue() {
        return regenValue;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getType() { return "ManaPotion"; }
}
