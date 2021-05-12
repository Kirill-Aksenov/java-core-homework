package com.company.lesson9;

public class MainClass {

    final static int ARRAY_SIZE = 4;

    public static void main(String[] args) {

        String[][] array = {{"1","2","3","4"},{"5","6","7","8"},{"9","10","11","12"},{"13","14","15","16"}};
        try {
            convertStringToNumberAndSum(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void convertStringToNumberAndSum(String[][] array) {
        for (String[] strings : array) {
            if (array.length != ARRAY_SIZE || strings.length != ARRAY_SIZE) {
                throw new MyArraySizeException("массив не соответсвует размеру " + ARRAY_SIZE + "х" + ARRAY_SIZE);
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    Integer.parseInt(array[i][j]);
                    int transformed = Integer.parseInt(array[i][j]);
                    sum += transformed;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("неверные данные в ячейке по индексу [" + i + "]" + "[" + j + "]");
                }
            }
        }
        System.out.println(sum);
    }
}
