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

    private static void playAgain() {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        Scanner console = new Scanner(System.in);
        int usersChoice = console.nextInt();
        if (usersChoice == 1) {
            checkNumber();
        }
        else {
            return;
        }
    }

    private static void checkNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Введите число:");
        for (int usersTries = 1; usersTries <= 3; usersTries ++) {
            Scanner console = new Scanner(System.in);
            int usersNumber = console.nextInt();

            if (usersNumber > randomNumber) {
                System.out.println("Ваше число больше загаданного. Попробуйте еще раз.");
                System.out.println("Осталось попыток: " + (3 - usersTries));
            }

            else if (usersNumber < randomNumber) {
                System.out.println("Ваше число меньше загаданного. Попробуйте еще раз.");
                System.out.println("Осталось попыток: " + (3 - usersTries));
            }

            else {
                System.out.println("Вы угадали!");
                break;
            }
        }
        playAgain();
    }
}
