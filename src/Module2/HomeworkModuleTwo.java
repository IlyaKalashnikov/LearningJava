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
    }
}