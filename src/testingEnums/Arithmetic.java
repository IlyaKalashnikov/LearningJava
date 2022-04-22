package testingEnums;

public enum Arithmetic {
    PLUS, MINUS, DIVISION, MULTIPLICATION;

    public static int plus(int x, int y) {
        return x + y;
    }

    public static int minus(int x, int y) {return x - y;}

    public static int division(int x, int y) {
        return x / y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static Arithmetic getEnum(String x) {
        switch (x) {
            case "+" -> x = "PLUS";
            case "-" -> x = "MINUS";
            case "*" -> x = "MULTIPLICATION";
            case "/" -> x = "DIVISION";
        }
        return Arithmetic.valueOf(x);
    }
}

