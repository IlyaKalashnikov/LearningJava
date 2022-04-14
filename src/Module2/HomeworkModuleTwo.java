package Module2;

import java.util.Arrays;

public class HomeworkModuleTwo {
    public static void main(String[] args) {
        System.out.println(balanceCheck());

        int[] arr = {1, 3, 2, 4, 6, 5};
        swapIndex(arr, 2);
    }

    private static void task5() {
        /**Задать одномерный массив и найти в нем минимальный
         *  и максимальный элементы;*/
        int[] arrayMaxAndMin = {5, 2, 7, 9, 12, 34, 7, 4, -2, 11, 7, 3, -99, 12, 14, 5, 1, 0};
        int min = arrayMaxAndMin[0];
        int max = arrayMaxAndMin[0];

        for (int x = 1; x < arrayMaxAndMin.length; x++) {
            if (arrayMaxAndMin[x] < min) {
                min = arrayMaxAndMin[x];
            } else if (arrayMaxAndMin[x] > max) {
                max = arrayMaxAndMin[x];
            }
        }
        System.out.println("Minimal value: " + min);
        System.out.println("Maximum value: " + max);

    }

    private static void task4() {
        /**Задать пустой целочисленный массив размером 8.
         * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/

        int[] progression = new int[8];
        for (int x = 0, y = 0; x < progression.length; x++) {
            progression[x] = y;
            y += 3;
        }
        System.out.println(Arrays.toString(progression));
    }

    private static void task3() {
        /**Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами.
         * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
         * то есть [0][0], [1][1], [2][2], …, [n][n];*/

        int[][] square = {
                {1, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2}
        };
        //0 - 5
        //1 - 4
        //2 - 3
        //3 - 2
        //2 - 1
        for (int i = 0; i < square.length; i++) {
            square[i][i] = 1;
            square[i][square.length - 1 - i] = 1;

//
//            for (int l = 0; l < square[i].length; l++) {
//                if (i == l) {
//                    square[i][l] = 1;
//                } else if (i + l == square.length - 1) {
//                    square[i][l] = 1;
//                }
//            }
        }
        for (int b = 0; b < square.length; b++) {
            System.out.println(Arrays.toString(square[b]));
        }
    }

    private static void task2() {
        /**Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         * пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
        int[] multiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int z = 0; z < multiplication.length; z++) {
            if (multiplication[z] < 6) {
                multiplication[z] = multiplication[z] * 2;
            }
        }
        System.out.println(Arrays.toString(multiplication));
    }

    /**
     * Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static void task1() {
        int[] onesAndZeroes = {1, 1, 0, 0, 1, 0, 0, 0, 1, 1};
        for (int i = 0; i < onesAndZeroes.length; i++) {
            onesAndZeroes[i] = onesAndZeroes[i] == 1 ? 0 : 1;
        }
        System.out.println(Arrays.toString(onesAndZeroes));
    }

    /**
     * Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true, если в массиве есть место,
     * в котором сумма левой и правой части массива равны.
     */
    static boolean balanceCheck() {
        int[] checkBalance = {1, 1, 2, 1, 3, 1, 1};
        int leftSum = 0;
        boolean checkComplete = false;

        for (int x = 0; x < checkBalance.length; x++) {
            leftSum += checkBalance[x];

            int rightSum = 0;

            for (int y = x + 1; y < checkBalance.length; y++) {
                rightSum += checkBalance[y];
            }

            if (leftSum == rightSum) {
                checkComplete = true;
                break;
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

    // 1 3 2 4 6 5 | n = 2
    // 6 5 1 3 2 4
    static void swapIndex(int[] originalArray, int n) {
        if (Math.abs(n) > originalArray.length) {
            n = n % originalArray.length;
        } else if (n == originalArray.length) {
            return;
        }

        if (n > 0) {
            for (int x = 0, countFrom = originalArray.length - n; x < n; x++, countFrom++) {
                for (int y = 0, step = countFrom; y < originalArray.length - n; y++, step--) {
                    swapElems(originalArray, step, step - 1);
                }
            }

        } else if (n < 0) {
            n = n * (-1);

            for (int x = 0, countFrom = n - 1; x < n; x++, countFrom--) {
                for (int y = 0, step = countFrom; y < originalArray.length - n; y++, step++) {
                    swapElems(originalArray, step, step - 1);
                }
            }
        }
        System.out.println(Arrays.toString(originalArray));

    }

    private static void swapElems(int[] originalArray, int step, int prevIndex) {
        int prevValue;
        prevValue = originalArray[prevIndex];
        originalArray[prevIndex] = originalArray[step];
        originalArray[step] = prevValue;
    }


}


