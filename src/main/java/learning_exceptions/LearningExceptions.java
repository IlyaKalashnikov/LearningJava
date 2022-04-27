package learning_exceptions;

public class LearningExceptions {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            System.out.println(sumOfArrayIndexes(array));
        } catch (MyArraySizeException e) {
            System.out.println("Подан массив с некорректными параметрами длины");
            System.out.println("Пожалуйста, подайте массив с параметрами [4][4]");
        } catch (MyArrayDataException e) {
            System.out.println("В массиве могут содержаться только целочисленные значения в формате строки");
        }
    }


    public static int sumOfArrayIndexes(String[][] ar) {
        checkArraySize(ar);
        int sumOfTheArrayElements = 0;
        int errorIndexOne = 0;
        int errorIndexTwo = 0;
        try {
            for (int i = 0; i < ar.length; i++) {
                errorIndexOne = i;
                for (int j = 0; j < ar[i].length; j++) {
                    errorIndexTwo = j;
                    int z = Integer.parseInt(ar[i][j]);
                    sumOfTheArrayElements += z;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Измените значения по адресу: [" + errorIndexOne + "] [" + errorIndexTwo + "]");
            throw new MyArrayDataException();
        }
        return sumOfTheArrayElements;
    }

    public static void checkArraySize(String[][] ar) {
        int i = ar.length;
        if (i != 4) {
            throw new MyArraySizeException();
        }
        for (int j = 0; j < ar.length; j++) {
            int n = ar[j].length;
            if (n != 4) {
                throw new MyArraySizeException();
            }
        }
    }

    public static class MyArraySizeException extends IndexOutOfBoundsException {

    }

    public static class MyArrayDataException extends IllegalArgumentException {

    }
}

