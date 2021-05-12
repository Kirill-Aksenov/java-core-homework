package com.company.lesson13;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {

    private final CyclicBarrier cyclicBarrier;
    private static boolean isWinner;

    private static int CARS_COUNT;
    private final Race race;
    private final int speed;
    private final String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier cyclicBarrier) {
        this.race = race;
        this.speed = speed;
        this.cyclicBarrier = cyclicBarrier;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    public synchronized void checkWinner(Car car) {
        if(!isWinner) {
            isWinner = true;
            System.out.println(car.getName() + " WIN");
        }
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            cyclicBarrier.await();
            cyclicBarrier.await();

            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }

            checkWinner(this);
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}