package com.company.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        String[] array = {"1", "2", "3", "4", "5"};
        swappingElementsOfArray(array, 0, 4);
        System.out.println(convertsArrayToList(array));

        Box<Apple> appleBoxOne = new Box<>("коробка с яблоками №1",new Apple(), new Apple(),new Apple(),
                new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBoxOne = new Box<>("коробка с апельсинами №1", new Orange(), new Orange(), new Orange(),
                new Orange());
        Box<Apple> appleBoxTwo = new Box<>("коробка с яблоками №2");
        Box<Orange> orangeBoxTwo = new Box<>("коробка с апельсинами №2");

        appleBoxOne.getWeight();
        orangeBoxOne.getWeight();

        System.out.println(appleBoxOne.compaire(orangeBoxOne));

        appleBoxOne.poursFruit(appleBoxTwo);
        appleBoxOne.getWeight();
        appleBoxTwo.getWeight();

        orangeBoxTwo.addFruit(new Orange());
        orangeBoxTwo.getWeight();
    }

    public static <T> void swappingElementsOfArray(T[] array, int firstIndex, int secondIndex) {
        if(firstIndex < 0 || firstIndex >= array.length && secondIndex < 0 || secondIndex >= array.length) {
            System.out.println("введите значения индексов массива в пределах от 0 до " + (array.length - 1));
        } else {
            T buffer = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = buffer;
        }
    }

    public static <T> List<T> convertsArrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
