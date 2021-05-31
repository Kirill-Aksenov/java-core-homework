package lesson03;

import java.util.Random;
import java.util.Scanner;

public class guessTheWord {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {

        String randomWord = words[random.nextInt(words.length)];
        System.out.println("Попробуйте угадать загаданное компьютером слово");

        while (true) {
            System.out.print("Напишите слово --> ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(randomWord)) {
                System.out.println("Вы угадали!");
                break;
            } else {
                getPartOfAnswer(userAnswer, randomWord);
            }

            System.out.println("Попробуйте ещё раз");
            System.out.println(getPartOfAnswer(userAnswer, randomWord));
        }
    }

    public static StringBuilder getPartOfAnswer(String userAnswer, String randomWord) {
        char[] chars = userAnswer.toCharArray();

        StringBuilder resultStr = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i < randomWord.length()) {
                if (chars[i] == randomWord.charAt(i)) {
                    resultStr.append(chars[i]);
                } else  {
                    resultStr.append("#");
                }
            }
        }

        resultStr.append("#############");
        return resultStr;
    }

}
