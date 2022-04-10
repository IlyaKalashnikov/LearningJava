package Module2;

import java.util.Arrays;

public class HomeworkModuleTwo {
    public static void main(String[] args) {
        /**Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         * С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        int[] onesAndZeroes = {1, 1, 0, 0, 1, 0, 0, 0, 1, 1};
        for (int i = 0; i < onesAndZeroes.length; i++) {
            if (onesAndZeroes[i] == 1) {
                onesAndZeroes[i] = 0;
            } else {
                onesAndZeroes[i] = 1;
            }
        }
        System.out.println(Arrays.toString(onesAndZeroes));

        /**Задать пустой целочисленный массив размером 8.
         * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/

        int[] progression = new int[8];
        for (int x = 0, y = 0; x < progression.length; x++) {
            progression[x] = y;
            y += 3;
        }
        System.out.println(Arrays.toString(progression));

        /**Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         * пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
        int[] multiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int z = 0; z < multiplication.length; z++) {
            if (multiplication[z] < 6) {
                multiplication[z] = multiplication[z] * 2;
            }
        }
        System.out.println(Arrays.toString(multiplication));

        /**Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами.
         * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
         * то есть [0][0], [1][1], [2][2], …, [n][n];*/

        int[][] square = {
                {2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2}
        };
        for (int p = 0; p < square.length; p++) {
            for (int l = 0; l < square[p].length; l++) {
                if (p == l) {
                    square[p][l] = 1;
                } else if (p + l == square.length - 1) {
                    square[p][l] = 1;
                }
            }
        }
        for (int b = 0; b < square.length; b++) {
            System.out.println(Arrays.toString(square[b]));
        }

        /**Задать одномерный массив и найти в нем минимальный
         *  и максимальный элементы;*/
        int[] arrayMaxAndMin = {5, 2, 7, 9, 12, 34, 7, 4, -2, 11, 7, 3, -99, 12, 14, 5, 1, 0};
        int min = arrayMaxAndMin[0];
        int max = arrayMaxAndMin[0];
        for (int x = 0; x < arrayMaxAndMin.length; x++) {
            if (arrayMaxAndMin[x] < min) {
                min = arrayMaxAndMin[x];
            } else if (arrayMaxAndMin[x] > max) {
                max = arrayMaxAndMin[x];
            }
        }
        System.out.println("Minimal value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println(balanceCheck());

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        swapIndex(arr, 2);
    }

    /**
     * Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true, если в массиве есть место,
     * в котором сумма левой и правой части массива равны.
     */
    static boolean balanceCheck() {
        int[] checkBalance = {-7, 5, 10, 4, 10, 1, 1};
        int newValue = 0;
        boolean checkComplete = false;
        for (int x = 0; x < checkBalance.length; x++) {
            int value = checkBalance[x];
            int secondNewValue = 0;
            newValue = newValue + value;
            for (int y = x + 1; y < checkBalance.length; y++) {
                int secondValue = checkBalance[y];
                secondNewValue = secondNewValue + secondValue;
                if (newValue == secondNewValue) {
                    checkComplete = true;
                }
            }
        }
        return checkComplete;
    }

    /**
     * Написать метод, которому на вход подается одномерный массив и число n
     * (может быть положительным, или отрицательным),при этом метод должен
     * сместить все элементы массива на n позиций. Элементы смещаются циклично.
     * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     */

    static void swapIndex(int[] originalArray, int n) {
        int saveValue = 0;
        if (n > 0) {
            if (n > originalArray.length) {
                n = n % originalArray.length;
            } else if (n == originalArray.length) {
                n = 0;
            }
            for (int x = 0, countFrom = originalArray.length - n; x < n; x++) {
                int stepCounter = originalArray.length - n;
                for (int y = 0, step = countFrom, previousValue = step - 1; y < stepCounter; y++) {
                    saveValue = originalArray[previousValue];
                    originalArray[previousValue] = originalArray[step];
                    originalArray[step] = saveValue;
                    step--;
                    previousValue--;
                }
                countFrom++;
            }
        } else if (n < 0) {
            n = n * (-1);
            if (n > originalArray.length) {
                n = n % originalArray.length;
            } else if (n == originalArray.length) {
                n = 0;
            }
            for (int x = 0, countFrom = 0 + n - 1; x < n; x++) {
                int stepCounter = originalArray.length - n;
                for (int y = 0, step = countFrom, nextValue = step + 1; y < stepCounter; y++) {
                    saveValue = originalArray[nextValue];
                    originalArray[nextValue] = originalArray[step];
                    originalArray[step] = saveValue;
                    step++;
                    nextValue++;
                }
                countFrom--;
            }
        }
        System.out.println(Arrays.toString(originalArray));

    }
}


