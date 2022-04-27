package Module2;

import java.util.Arrays;

public class LastTask {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        moveTheArray(array, -14);
    }

    private static void moveTheArray(int[] array, int n) {
        if (Math.abs(n) > array.length) {
            n = n % array.length;
        } else if (n == array.length) {
            return;
        }

        if (n > 0) {
            int loopLength = array.length - n;
            while (array.length - n != array.length) {
                swapElementsForPositiveN(array, n, loopLength);
                n--;
            }
            System.out.println(Arrays.toString(array));
        } else if (n < 0) {
            n = n * -1;
            int loopLength = array.length - n;
            int countFromThisIndex = n - 1;
            while (countFromThisIndex >= 0) {
                swapElementsForNegativeN(array, loopLength, countFromThisIndex);
                countFromThisIndex--;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    private static void swapElementsForNegativeN(int[] array, int loopLength, int countFromThisIndex) {
        int takeNextIndex = countFromThisIndex + 1;
        for (int i = 0; i < loopLength; i++, countFromThisIndex++, takeNextIndex++) {
            saveAndPassValueForNegative(array, countFromThisIndex, takeNextIndex);
        }
    }

    private static void saveAndPassValueForNegative(int[] array, int countFromThisIndex, int takeNextIndex) {
        int passValue;
        passValue = array[takeNextIndex];
        array[takeNextIndex] = array[countFromThisIndex];
        array[countFromThisIndex] = passValue;
    }


    private static void swapElementsForPositiveN(int[] array, int n, int loopLength) {
        int countFromThisIndex = array.length - n;
        int takePreviousIndex = countFromThisIndex - 1;
        for (int i = 0; i < loopLength; i++, countFromThisIndex--, takePreviousIndex--) {
            saveAndPassValueForPositive(array, countFromThisIndex, takePreviousIndex);
        }
    }

    private static void saveAndPassValueForPositive(int[] array, int countFromThisIndex, int takePreviousIndex) {
        int passValue;
        passValue = array[countFromThisIndex];
        array[countFromThisIndex] = array[takePreviousIndex];
        array[takePreviousIndex] = passValue;
    }
}
