package com.company.lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        replaces1And0(new int[] { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1 });

        createAndFillEmptyArray();

        numbersLessThanSixMultiplyByTwo(new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 });

        fillsTheDiagonalMatrix();

        findsMinAndMax(new int[] { -5, 10, 25, 8 });

        System.out.println(checkBalance(new int[] { 1, 1, 1, 2, 1 }));

        shiftArray(new int[] { 1, 2, 3, 4, 5 }, -1);

    }

    public static void replaces1And0(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void createAndFillEmptyArray() {
        int[] array = new int[8];
        for (int i = 0, j = 0; i < array.length; i++, j += 3) {
            array[i] = j;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void numbersLessThanSixMultiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *=2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillsTheDiagonalMatrix() {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i] == matrix[j]) {
                    matrix[i][j] = 1;
                } else if (i + j == (matrix.length - 1)) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findsMinAndMax(int[] array) {
        if (array.length == 0) {
            System.out.println("Массив не должен быть пустым!");
        } else {
            int min = array[0], max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] <= min) {
                    min = array[i];
                } else if (array[i] >= max) {
                    max = array[i];
                }
            }
            System.out.println("Минимальный элемент массива " + min);
            System.out.println("Максимальный элемент массива " + max);
        }
    }

    public static boolean checkBalance(int[] array) {
        int sumLeftSide = 0;
        boolean result = false;
        for (int i = 0; i < (array.length - 1); i++) {
            sumLeftSide += array[i];
            int sumRightSide = 0;
            for (int j = (array.length - 1); j > i; j--) {
                sumRightSide += array[j];
            }
            if (sumLeftSide == sumRightSide) {
                result = true;
                break;
            }
            }
        return result;
    }

    private static void shiftArray(int[] array, int shiftValue) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            // Circular Array Rotation
            result[i] = array[(array.length + i - shiftValue) % array.length];
        }
        System.out.println(Arrays.toString(result));
    }
}
