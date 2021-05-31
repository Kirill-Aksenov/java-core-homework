package lesson04;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static char[][] map;
    public static final int SIZE = 8;
    public static final int DOTS_TO_WIN = 4;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();

            if (checkWin(DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра закончена!");
        sc.close();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(map.length);
            y = rand.nextInt(map.length);
        } while (isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= map.length || y < 0 || y >= map.length) {
            return true;
        }
        return map[y][x] != DOT_EMPTY;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char symb) {
        return checkWinHorizontal(symb) || checkWinVertical(symb) ||
                checkWinDiagonal1(symb) || checkWinDiagonal2(symb);
    }

    public static boolean checkWinHorizontal(char symb) {
        StringBuilder resultStr = new StringBuilder();

        for (int i = 0; i < map.length; i++) {
            resultStr.setLength(0);
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == symb) {
                    resultStr.append(symb);
                    if(resultStr.length() == DOTS_TO_WIN) {
                        return true;
                    }
                } else {
                    resultStr.setLength(0);
                }
            }
        }
        return false;
    }

    public static boolean checkWinVertical(char symb) {
        StringBuilder resultStr = new StringBuilder();

        for (int i = 0; i < map.length; i++) {
            resultStr.setLength(0);
            for (int j = 0; j < map.length; j++) {
                if (map[j][i] == symb) {
                    resultStr.append(symb);
                    if(resultStr.length() == DOTS_TO_WIN) {
                        return true;
                    }
                } else {
                    resultStr.setLength(0);
                }
            }
        }
        return false;
    }

    // метод проверяет все диагонали идущие слева сверху --> направо вниз,
    // в которых возможно собрать заданное количество фишек при заданном размере поля
    public static boolean checkWinDiagonal1(char symb) {
        StringBuilder resultStr = new StringBuilder();
        int special = (map.length - DOTS_TO_WIN); // int special показывает на скольких диагоналях в стороны от
                                                  // основной возможно собрать победную комбинацию фишек
        for (int x = -special; x <= special; x++) {
            resultStr.setLength(0);
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if ((i - j) == x && map[i][j] == symb) {
                        resultStr.append(symb);
                        if(resultStr.length() == DOTS_TO_WIN) {
                            return true;
                        }
                    } else if ((i - j) == x) {
                        resultStr.setLength(0);
                    }
                }
            }
        }
        return false;
    }

    // метод проверяет все диагонали идущие справа сверху --> налево вниз,
    // в которых возможно собрать заданное количество фишек при заданном размере поля
    public static boolean checkWinDiagonal2(char symb) {
        StringBuilder resultStr = new StringBuilder();
        int special = (map.length - DOTS_TO_WIN); // int special показывает на скольких диагоналях в стороны от
                                                  // основной возможно собрать победную комбинацию фишек
        for (int x = ((map.length - 1) - special); x <= ((map.length - 1) + special); x++) {
            resultStr.setLength(0);
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if ((i + j) == x && map[i][j] == symb) {
                        resultStr.append(symb);
                        if(resultStr.length() == DOTS_TO_WIN) {
                            return true;
                        }
                    } else if ((i + j) == x) {
                        resultStr.setLength(0);
                    }
                }
            }
        }
        return false;
    }

}
