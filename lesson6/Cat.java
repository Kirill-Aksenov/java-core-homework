package com.company.lesson6;

public class Cat extends Animal {

    private static int sumCats;

    public Cat(String name) {
        super(name);
        setMaxRun(200);
        setMaxSwim(0);
        sumCats += 1;
    }

    @Override
    public void mustRun(int runningDistance) {
        if (runningDistance > getMaxRun()) {
            System.out.println("Кот " + getName() + " не может пробежать так много!");
        } else if (runningDistance <= 0) {
            System.err.println("Введите положительное число!");
        } else {
            System.out.println("Кот " + getName() + " пробежал метров: " + runningDistance);
        }
    }

    @Override
    public void mustSwim(int swimmingDistance) {
            System.out.println("Кот " + getName() + " не умеет плавать!");
    }

    public static void printSumCats() {
        System.out.println("Число созданных котиков: " + sumCats);
    }

}
