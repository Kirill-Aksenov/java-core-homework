package com.company.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit & SpecificFruit> {

    private String name;
    private final List<T> fruitBox;

    public Box(String name, T... fruitBox) {
        this.name = name;
        this.fruitBox = new ArrayList<>(Arrays.asList(fruitBox));
    }

    public String getName() {
        return name;
    }

    public List<T> getFruitBox() {
        return fruitBox;
    }

    public float getWeight() {
        float sumWeight = 0;
        for (T fruit : fruitBox) {
            sumWeight += fruit.getWeight();
        }
        System.out.println(getName() + " весит: " + sumWeight);
        return sumWeight;
    }

    public boolean compaire(Box<?> comparisonBox) {
       return (Math.abs(this.getWeight() - comparisonBox.getWeight()) < 0.001);
    }

    public void poursFruit(Box<T> newBox) {
        List<T> newFruitBox = newBox.getFruitBox();
        newFruitBox.addAll(fruitBox);
        fruitBox.clear();
    }

    public void addFruit(T fruit) {
        fruitBox.add(fruit);
    }
}
