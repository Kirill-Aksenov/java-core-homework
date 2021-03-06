package lesson08;

import lesson08.interfaces.Participants;
import lesson08.interfaces.Obstacles;

public class Wall implements Obstacles {

    private String name;
    private int wallHeight;

    public Wall(String name, int wallHeight) {
        this.name = name;
        this.wallHeight = wallHeight;
    }

    @Override
    public boolean pass(Participants object) {
        if (object.mustJump() >= wallHeight) {
            System.out.println(object.info() + " перепрыгнул препятствие " + name);
            return true;
        } else {
            System.out.println(object.info() + " не смог перепрыгнуть препятствие " + name);
            return false;
        }
    }
}
