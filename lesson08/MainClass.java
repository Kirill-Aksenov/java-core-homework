package lesson08;

import lesson08.interfaces.Obstacles;
import lesson08.interfaces.Participants;

public class MainClass {

    public static void main(String[] args) {

        Participants[] participantsArr = new Participants[6];
        participantsArr[0] = new Human("Алёша", 500, 45);
        participantsArr[1] = new Human("Сергей", 240, 65);
        participantsArr[2] = new Cat("Мурзик", 1500, 150);
        participantsArr[3] = new Cat("Барсик", 1200, 140);
        participantsArr[4] = new Robot("R2D2", 200, 15);
        participantsArr[5] = new Robot("Терминатор", 2500, 100);

        Obstacles[] obstaclesArr = new Obstacles[4];
        obstaclesArr[0] = new Treadmill("лёгкая дорожка", 250);
        obstaclesArr[1] = new Wall("невысокая стена", 50);
        obstaclesArr[2] = new Treadmill("тяжёлая дорожка", 1500);
        obstaclesArr[3] = new Wall("высокая стена", 120);

        for (Obstacles obstacles : obstaclesArr) {
            for (int j = 0; j < participantsArr.length; j++) {
                if (participantsArr[j] == null) {
                    continue;
                } else if (!obstacles.pass(participantsArr[j])) {
                    participantsArr[j] = null;
                }
            }
            System.out.println("--------------------");
        }

    }

}
