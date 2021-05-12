package com.company.lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean isSatiated;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isSatiated = false;
    }

    public void eat(Plate plate) {
        if (appetite <= plate.getFood()) {
            isSatiated = true;
        }
        plate.decreaseFood(appetite);
    }

    public static void catInfo(Cat [] catsArr) {
        for (Cat cat : catsArr) {
            if (cat.isSatiated) {
                System.out.println(cat.name + " покушал");
            } else {
                System.out.println(cat.name + " остался голодным");
            }
        }
    }

}