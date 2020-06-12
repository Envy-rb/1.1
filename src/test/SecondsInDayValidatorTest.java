package test;

import org.junit.jupiter.api.Test;
import validator.SecondsInDayValidator;

import static org.junit.jupiter.api.Assertions.*;

class SecondsInDayValidatorTest {
    SecondsInDayValidator testingInstance = new SecondsInDayValidator();
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