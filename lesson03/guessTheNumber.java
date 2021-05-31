package lesson03;

import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {

    public static final int MAX_NUMBER = 10;
    public static final int COUNT_ATTEMPTS = 3;

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        String userAnswer;

        do {
            int randomNumber = random.nextInt(MAX_NUMBER);
            System.out.println("Попробуйте угадать число от 0 до " + MAX_NUMBER +
                    ". У вас будет попыток: " + COUNT_ATTEMPTS);

            for (int i = 1; i <= COUNT_ATTEMPTS; i++) {
                System.out.print("Введите число --> ");
                int answer = scanner.nextInt();

                if (answer > randomNumber) {
                    System.out.println("Загаданное число меньше!");
                    System.out.println("Осталось попыток: " + (COUNT_ATTEMPTS - i));

                } else if (answer < randomNumber) {
                    System.out.println("Загаданное число больше!");
                    System.out.println("Осталось попыток: " + (COUNT_ATTEMPTS - i));

                } else {
                    System.out.println("Вы угадали!");
                    break;
                }

                if (i == COUNT_ATTEMPTS) {
                    System.out.println("Вы проиграли!");
                }
            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            System.out.print("--> ");
            userAnswer = scanner.next();
        } while (userAnswer.equals("1") || userAnswer.equals("да"));

    }

}
