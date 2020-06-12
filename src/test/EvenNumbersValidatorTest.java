package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import validator.EvenNumbersValidator;

class EvenNumbersValidatorTest {
    EvenNumbersValidator testingInstance = new EvenNumbersValidator();

    @Test
    public void test1()
    {
        boolean actual = testingInstance.validate(1,2,3,4,5);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2()
    {
        boolean actual = testingInstance.validate(1,2,3,4);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

}