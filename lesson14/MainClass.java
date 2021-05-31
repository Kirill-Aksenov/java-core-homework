package lesson14;

public class MainClass {

        public int[] getsValueAfterFour(int[] array) {
            if (array.length == 0) {
                throw new RuntimeException("Массив не должен быть пустым");
            }
            int[] newArray = new int[0];
            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                if (array[i] == 4) {
                    int[] special = new int[j];
                    System.arraycopy(array, i + 1, special, 0, j);
                    newArray = special;
                    break;
                } else if (i == 0) {
                    throw new RuntimeException("Массив не содержит в себе данного элемента --> 4");
                }
            }
            return newArray;
        }

        public boolean checkOneAndFourInArray(int[] array) {
            if (array.length == 0) {
                throw new RuntimeException("Массив не должен быть пустым");
            }
            boolean isOne = false, isFour = false;
            for (int value : array) {
                if (value == 1) {
                    isOne = true;
                } else if (value == 4) {
                    isFour = true;
                } else {
                    return false;
                }
            }
            return isOne && isFour;
        }
}
