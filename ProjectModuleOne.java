package ModuleOne;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProjectModuleOne {
    public static void main(String[] args) {
        System.out.println("Result: " + getResult(1.0f, 2.5f, 5.0f, 2.5f));
        System.out.println("Between ten and twenty: " + betweenTenAndTwenty(3, 15));
        System.out.println("Int x is greater than zero: " + aboveZero(245));
        System.out.println(positiveOrNegative(4));
        System.out.println(positiveOrNegative(-4));
        System.out.println(positiveOrNegative(0));
        System.out.println(greetings("Илья"));
        System.out.println(leapYear(8));
        System.out.println(leapYear(16));
        System.out.println(leapYear(27));
        System.out.println(leapYear(44));
        System.out.println(leapYear(100));
        System.out.println(leapYear(112));
        System.out.println(leapYear(800));
        System.out.println(leapYear(362));
        System.out.println(leapYear(12));
        System.out.println(gitCheck("Git регистрирует изменения"));
    }

    /**
     * Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
     *
     * @param a – аргументы этого метода, имеющие тип float.
     * @param b
     * @param c
     * @param d
     * @return
     */

    static float getResult(float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    /**
     * Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно)
     *
     * @param a целое число
     * @param b целое число
     * @return если да – вернуть true, в противном случае – false
     */
    static boolean betweenTenAndTwenty(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    /**
     * Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     *
     * @param x целое число
     * @return true, если число отрицательное, и false если положительное
     */
    static boolean aboveZero(int x) {
        return (x >= 0);
    }

    /**
     * Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     *
     * @param y целое число
     * @return метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     */
    static String positiveOrNegative(int y) {
        String a = "Это положительное число";
        String b = "Это отрицательное число";
        if (y >= 0) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Написать метод, которому в качестве параметра передается строка, обозначающая имя.
     * Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
     *
     * @param name строка, обозначающая имя
     * @return вывести в консоль сообщение «Привет, указанное_имя!»
     */
    static String greetings(String name) {
        return "Привет, " + name;
    }

    /**
     * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     *
     * @param x
     * @return выводит сообщение в консоль.
     */
    static String leapYear(int x) {
        String leap = "Это високосный год";
        String notLeap = "Это не високосный год";
        if (((x % 4) == 0) && ((x % 100)) != 0) {
            return leap;
        } else if ((x % 400) == 0) {
            return leap;
        } else {
            return notLeap;
        }

    }

    static String gitCheck(String gitRegs) {
        return gitRegs;
    }

    static String gitNewBranch(String newBranch) {
        return newBranch;
    }
}

