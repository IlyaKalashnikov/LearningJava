package oopBasics.testingEnums;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Number numberOne = new Number();
        Number numberTwo = new Number();
        numberOne.setNumber(console.nextInt());

        do {
            if (console.hasNextInt()) {
                numberOne.setNumber(console.nextInt());}
            String c = console.next();
            if (c.equalsIgnoreCase("exit")) {
                break;
            }
            numberTwo.setNumber(console.nextInt());
            try {
                calculate(numberOne, numberTwo, c);
                System.out.println(numberOne);
                notification();
            } catch (ArithmeticException e) {
                System.out.println("Введено некорректное значение");
            } catch (IrrelevantDataException e) {
                System.out.println("Введен некорректный символ: " + c);
            }
        } while (true);
    }

    private static void calculate(Number numberOne, Number numberTwo, String c) {
            switch (Arithmetic.getEnum(c)) {
                case PLUS -> numberOne.setNumber(Arithmetic.plus(numberOne.getNumber(), numberTwo.getNumber()));
                case MINUS -> numberOne.setNumber(Arithmetic.minus(numberOne.getNumber(), numberTwo.getNumber()));
                case MULTIPLICATION -> numberOne.setNumber(Arithmetic.multiplication(numberOne.getNumber(), numberTwo.getNumber()));
                case DIVISION -> numberOne.setNumber(Arithmetic.division(numberOne.getNumber(), numberTwo.getNumber()));
            }
    }

    private static void notification() {
        System.out.println("To cancel process enter EXIT");
    }
}
