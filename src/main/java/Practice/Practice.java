package Practice;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        /**Написать программу, которая загадывает случайное число от 0 до 9.
         * Пользователю дается 3 попытки угадать это число.
         * При каждой попытке компьютер должен сообщить,
         * больше ли указанное пользователем число, чем загаданное, или меньше.
         * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет».
         */

        checkNumber();
    }

        //if (usersChoice == 1) {
          //  checkNumber();
        //}
        //else if (usersChoice > 1 || usersChoice < 0) {
          //  playAgain();
        //}
        //else {
          //  return;


    private static void checkNumber() {
        Scanner console = new Scanner(System.in);
        do {
            int randomNumber = new Random().nextInt(10);
            System.out.println("Введите число:");
            for (int usersTries = 1; usersTries <= 3; usersTries++) {
                int usersNumber = console.nextInt();
                if (usersNumber > randomNumber) {
                    usersGreaterThanRandom(usersTries);
                } else if (usersNumber < randomNumber) {
                    usersLowerThanRandom(usersTries);
                } else {
                    System.out.println("Вы угадали!");
                    break;
                }
            }
            System.out.println("sdsdsd");
            if (console.nextInt() != 1) {
                break;
            }
        } while (true);
    }

    private static void usersLowerThanRandom(int usersTries) {
        System.out.println("Ваше число меньше загаданного. Попробуйте еще раз.");
        System.out.println("Осталось попыток: " + (3 - usersTries));
    }

    private static void usersGreaterThanRandom(int usersTries) {
        System.out.println("Ваше число больше загаданного. Попробуйте еще раз.");
        System.out.println("Осталось попыток: " + (3 - usersTries));
    }
}
