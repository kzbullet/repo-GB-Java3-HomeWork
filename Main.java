package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void swapElements (Object[] arr) {
        int r1 = (int) (Math.random() * arr.length);
        int r2 = (int) (Math.random() * arr.length);
        Object temp = arr[r1];
        arr[r1] = arr[r2];
        arr[r2] = temp;
        System.out.println(Arrays.toString(arr));
    }

    private static void task1() {
        String[] myArray = new String[6];
        myArray[0] = "A";
        myArray[1] = "B";
        myArray[2] = "C";
        myArray[3] = "D";
        myArray[4] = "E";
        myArray[5] = "F";
        swapElements(myArray);
    }

    private static ArrayList convertedArrayList (Object[] arr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        System.out.println(arrayList);
        return arrayList;
    }

    private static void task2() {
        Integer[] intArray = new Integer[6];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        intArray[5] = 6;

        convertedArrayList(intArray);
    }

    private static void task3() {
        Apple apple1 = new Apple(30);
        Apple apple2 = new Apple(10);
        Apple apple3 = new Apple(1);
        Orange orange1 = new Orange(20);
        Orange orange2 = new Orange(5);

        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();
        Box<Orange> box4 = new Box<>();

        box1.addFruits(apple1);
        box1.addFruits(apple1); //this will not work, apple1 already added
        box2.addFruits(apple2);
        box3.addFruits(orange1);
        box4.addFruits(orange2);
        box1.addFruits(apple3);

        System.out.println(box1.getWeight());
        System.out.println(box3.getWeight());
        box1.compare(box3);

        box1.addBox(box2);
        System.out.println(box1.getWeight());

        box1.addBox(box2); //this will not work, box2 is empty
    }
}
