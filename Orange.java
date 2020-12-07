package ru.geekbrains;

public class Orange extends Fruit {
    private float weight = 1.0f;
    private int qty;

    public Orange(int qty) {
        super(qty);
    }

    public float getWeight() {
        return weight;
    }
}
