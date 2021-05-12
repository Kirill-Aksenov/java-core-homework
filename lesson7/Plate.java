package com.company.lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (n <= food) {
            food -= n;
        }
    }

    public void plateInfo() {
        System.out.println("Еды в тарелке: " + food);
    }

    public void addFood(int moreFood) {
        food += moreFood;
    }

    public int getFood() {
        return food;
    }
}
