package test;

import org.junit.jupiter.api.Test;
import validator.YearValidator;

import static org.junit.jupiter.api.Assertions.*;

class YearValidatorTest {
    YearValidator testingInstance = new YearValidator();

    @Test
    public void test1()
    {
        boolean actual = testingInstance.validate(-5, 1);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void test2()
    {
        boolean actual = testingInstance.validate(6, 2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

}