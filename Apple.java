package ru.geekbrains;

public class Apple extends Fruit {
    private float weight = 1.3f;
    private int qty;

    public Apple(int qty) {
        super(qty);
    }

    public float getWeight() {
        return weight;
    }

}
