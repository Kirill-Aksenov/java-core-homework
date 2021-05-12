package com.company.lesson8;

import com.company.lesson8.interfaces.Participants;
import com.company.lesson8.interfaces.Obstacles;

public class Treadmill implements Obstacles {

    private String name;
    private int trackLength;

    public Treadmill(String name, int trackLength) {
        this.name = name;
        this.trackLength = trackLength;
    }

    @Override
    public boolean pass(Participants object) {
        if(object.mustRun() >= trackLength) {
            System.out.println(object.info() + " пробежал препятствие " + name);
            return true;
        } else {
            System.out.println(object.info() + " не смог пробежать препятствие " + name);
            return false;
        }
    }
}
