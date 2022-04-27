import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import oopBasics.testingEnums.Arithmetic;

class ArithmeticTest {

    @Test
    void plusShouldReturn4() {
        int actual = Arithmetic.plus(2, 2);
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minusShouldReturn0() {
        int actual = Arithmetic.minus(2, 2);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minusShouldReturnMinus1() {
        int actual = Arithmetic.minus(1, 2);
        int expected = -1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divisionShouldReturn1() {
        int actual = Arithmetic.division(2, 2);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divisionShouldReturnMinus1() {
        int actual = Arithmetic.division(-2, 2);
        int expected = -1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divisionShouldReturnException() {
        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
            Arithmetic.division(1, 0);
        });
    }

    @Test
    void multiplicationShouldReturn4() {
        int actual = Arithmetic.multiplication(2, 2);
        int expected = 4;
        Assertions.assertEquals(expected,actual);
    }
}

