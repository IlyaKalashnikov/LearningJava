import learning_exceptions.LearningExceptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LearningExceptionsTest {

    String[][] array1ForSizeExceptionTest = {
            {"1", "2", "3", "4", "5"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
    };

    String[][] array2ForSizeExceptionTest = {
            {"1", "2", "3", "4",},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"},
            {"17"}
    };

    @Test
    void MyArraySizeExceptionShouldBeThrown() {
        LearningExceptions.MyArraySizeException thrown = Assertions.assertThrows(LearningExceptions.MyArraySizeException.class, ()
                -> {
            LearningExceptions.checkArraySize(array1ForSizeExceptionTest);
        });
    }

    @Test
    void MyArraySizeExceptionThrown2() {
        LearningExceptions.MyArraySizeException thrown = Assertions.assertThrows(LearningExceptions.MyArraySizeException.class, ()
                -> {
            LearningExceptions.checkArraySize(array2ForSizeExceptionTest);
        });
    }


    String[][] arrayForElementSumTest = {
            {"1", "1", "1", "1"},
            {"1", "1", "1", "1"},
            {"1", "1", "1", "1"},
            {"1", "1", "1", "1"}
    };

    @Test
    void sumOfArrayIndexesShouldReturn16() {
        int actual = LearningExceptions.sumOfArrayIndexes(arrayForElementSumTest);
        int expected = 16;
        Assertions.assertEquals(expected, actual);
    }

    String[][] arrayForDataExceptionTest = {
            {"s", "1", "1", "1"},
            {"1", "1", "1", "1"},
            {"1", "1", "1", "1"},
            {"1", "1", "1", "1"}
    };

    @Test
    void NumberFormatExceptionShouldBeThrown () {
        LearningExceptions.MyArrayDataException thrown = Assertions.assertThrows(LearningExceptions.MyArrayDataException.class, () -> {
            LearningExceptions.sumOfArrayIndexes(arrayForDataExceptionTest);
        });
    }
}
