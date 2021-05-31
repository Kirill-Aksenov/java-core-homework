package lesson12;

import java.util.Arrays;

public class MainClass {

    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {

        worksInOneThread();
        worksInTwoThread();

    }

    public static void worksInOneThread() {
        float[] array = new float[SIZE];
        Arrays.fill(array, 1);
        long a = System.currentTimeMillis();
        calculatingValue(array);
        System.currentTimeMillis();
        System.out.println("Создание и работа с массивом в одном потоке заняла " + (System.currentTimeMillis() - a) +
                " милисекунд");
    }

    public static void worksInTwoThread() {
        float[] arraySource = new float[SIZE];
        Arrays.fill(arraySource, 1);
        float[] arrayAssignmentOne = new float[HALF];
        float[] arrayAssignmentTwo = new float[HALF];
        long a = System.currentTimeMillis();
        System.arraycopy(arraySource, 0, arrayAssignmentOne, 0, HALF);
        System.arraycopy(arraySource, HALF, arrayAssignmentTwo, 0, HALF);
        Thread treadOne = new Thread(() -> calculatingValue(arrayAssignmentOne));
        Thread treadTwo = new Thread(() -> calculatingValue(arrayAssignmentTwo));
        treadOne.start();
        treadTwo.start();
        try {
            treadOne.join();
            treadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(arrayAssignmentOne, 0, arraySource, 0, HALF);
        System.arraycopy(arrayAssignmentTwo, 0, arraySource, HALF, HALF);
        System.currentTimeMillis();
        System.out.println("Создание и работа с массивом в двух потоках заняла " + (System.currentTimeMillis() - a) +
                " милисекунд");
    }

    public static void calculatingValue(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
