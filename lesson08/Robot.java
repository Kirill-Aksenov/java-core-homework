package lesson08;

import lesson08.interfaces.Participants;

public class Robot implements Participants {

    private String name;
    private int maxRun;
    private int maxLeap;

    public Robot(String name, int maxRun, int maxLeap) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxLeap = maxLeap;
    }

    @Override
    public void jumpInfo() {
        System.out.println("робот " + name + " прыгает");
    }

    @Override
    public void runInfo() {
        System.out.println("робот " + name + " бежит");
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
