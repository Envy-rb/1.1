package test;

import org.junit.jupiter.api.Test;
import validator.secondsInDayValidator;

import static org.junit.jupiter.api.Assertions.*;

class secondsInDayValidatorTest {
    secondsInDayValidator testingInstance = new secondsInDayValidator();
    @Test
    void test1()
    {
        boolean actual = testingInstance.validate(-2);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    void test2()
    {
        boolean actual = testingInstance.validate(567);
        boolean expected = true;
        assertEquals(actual, expected);
    }
}