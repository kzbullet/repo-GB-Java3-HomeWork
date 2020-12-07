package ru.geekbrains;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    public boolean addFruits (T fruit) {
        if (fruits.contains(fruit)) {
            System.out.println("fruit is already in the box");
            return false;
        } else {
            fruits.add(fruit);
            return true;
        }
    }

    public float getWeight() {
        float sum = 0;
        for (Fruit fruit : fruits) {
            sum += fruit.getWeight() * fruit.getQty();
        }
        return sum;
    }

    public boolean compare(Box<?> anotherBox) {
        if (this.getWeight() == anotherBox.getWeight()) {
            System.out.println("box weights are equal");
            return true;
        } else {
            System.out.println("box weights are different");
            return false;
        }
    }

    public void addBox (Box<T> anotherBox) {
        if (!anotherBox.fruits.isEmpty()) {
            for (T fruit: anotherBox.fruits) {
                this.fruits.add(fruit);
            }
            anotherBox.fruits.removeAll(fruits);
        } else {
            System.out.println("Box you are trying to add is empty.");
        }
    }

}
