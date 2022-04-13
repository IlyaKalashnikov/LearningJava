package Practice;

import java.util.Random;
import java.util.Scanner;

public class PracticeSecondTask {
    public static void main(String[] args) {

        /**Создать массив из слов
         String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
         "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
         "pineapple", "pumpkin", "potato"}.
         При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
         сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
         Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
         apple – загаданное
         apricot - ответ игрока
         ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
         Угаданные в прошлые ответы буквы запоминать не надо. То есть при следующем ответе: carpet
         (ковер, не фрукт, но это всего лишь пример), будет выведено:
         ####e##########

         Для сравнения двух слов посимвольно можно пользоваться:
         String str = "apple";
         char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
         Играем до тех пор, пока игрок не отгадает слово.
         Используем только буквы в нижнем регистре.
         */

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        String randomWord = words[random.nextInt(25)];

        System.out.println("Введите ваше слово:");

        Scanner console = new Scanner(System.in);
        String usersWord = console.nextLine();

        compareWords(randomWord, usersWord);

        while (!usersWord.equals(randomWord)) {
            usersWord = console.nextLine();
            compareWords(randomWord, usersWord);
        }
        System.out.println("Угадали!");
    }

    private static void compareWords(String randomWord, String usersWord) {
        int loopLength = getLoopLength(randomWord, usersWord);
        for (int i = 0; i < loopLength; i++) {
            char a = usersWord.charAt(i);
            char b = randomWord.charAt(i);
            if (a == b) {
                System.out.print(usersWord.charAt(i));
            } else {
                System.out.print("#");
            }
        }
        for (int i = 0; i < 15 - loopLength; i ++) {
            System.out.print("#");
        }
        System.out.println();
    }

    private static int getLoopLength(String randomWord, String usersWord) {
        int usersWordLength = usersWord.length();
        int randomWordLength = randomWord.length();
        int loopLength;
        if (usersWordLength < randomWordLength) {
            loopLength = usersWordLength;
        } else {
            loopLength = randomWordLength;
        }
        return loopLength;
    }


}

