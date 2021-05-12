package com.company.lesson7;

public class MainClass {

    public static void main(String[] args) {

        Cat[] catsArr = new Cat [5];
        catsArr[0] = new Cat("Обжора", 45);
        catsArr[1] = new Cat("Вася", 25);
        catsArr[2] = new Cat("Мурзик", 20);
        catsArr[3] = new Cat("Шустрик", 25);
        catsArr[4] = new Cat("Рыжик", 15);
        Plate plate = new Plate (100);

        plate.plateInfo();

        for (Cat cat : catsArr) {
            cat.eat(plate);
        }

        Cat.catInfo(catsArr);
        plate.plateInfo();
        plate.addFood(90);
        plate.plateInfo();

    }

}
