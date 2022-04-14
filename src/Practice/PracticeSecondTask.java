package Practice;

import java.util.Random;
import java.util.Scanner;

public class PracticeSecondTask {
    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        String randomWord = words[new Random().nextInt(25)];

        System.out.println("Введите ваше слово:");

        String usersWord = new Scanner(System.in).nextLine();

        compareWords(randomWord, usersWord);

        while (!usersWord.equals(randomWord)) {
            usersWord = new Scanner(System.in).nextLine();
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

