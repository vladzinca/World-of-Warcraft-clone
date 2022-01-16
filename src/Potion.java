interface Potion {
    void regenerate(Entity entity);

    int getPrice();

    int getRegenValue();

    int getWeight();

    String getType();
}