package com.company.lesson8;

import com.company.lesson8.interfaces.Participants;

public class Cat implements Participants {

    private String name;
    private int maxRun;
    private int maxLeap;

    public Cat(String name, int maxRun, int maxLeap) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxLeap = maxLeap;
    }

    @Override
    public void jumpInfo() {
        System.out.println("кот " + name + " прыгает");
    }

    @Override
    public void runInfo() {
        System.out.println("кот " + name + " бежит");
    }

    @Override
    public int mustJump() {
        return maxLeap;
    }

    @Override
    public int mustRun() {
        return maxRun;
    }

    public String info() {
        return name;
    }

}
