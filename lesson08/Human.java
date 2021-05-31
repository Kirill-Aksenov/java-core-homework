package lesson08;

import lesson08.interfaces.Participants;

public class Human implements Participants {

    private String name;
    private int maxRun;
    private int maxLeap;

    public Human(String name, int maxRun, int maxLeap) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxLeap = maxLeap;
    }

    @Override
    public void jumpInfo() {
        System.out.println("человек " + name + " прыгает");
    }

    @Override
    public void runInfo() {
        System.out.println("человек " + name + " бежит");
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
