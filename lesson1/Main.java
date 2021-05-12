package com.company.lesson1;

public class Main {

    public static void main(String[] args) {

        byte x1 = -77;
        short x2 = 870;
        int x3 = -777001;
        long x4 = 777002L;
        float x5 = 77.01f;
        double x6 = 54.851;
        char x7 = 'K';
        boolean x8 = false;
        String x9 = "Kirill";
    }

    public static float calculateNumbers(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean isNumbersSumInRageFrom10To20(int number1, int number2) {
        int sum = number1 + number2;
        return sum >= 10 && sum <=20;
        }

    public static void isPositive(int number) {
        if (number >= 0) {
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }
    }

    public static boolean isNegative(int number) {
       return number < 0;
    }

    public static void printHelloForName(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void IsYearLeap(int year) {
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
    }
}
