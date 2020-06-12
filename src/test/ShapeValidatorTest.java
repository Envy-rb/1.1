package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import validator.ShapeValidator;

class ShapeValidatorTest {
    ShapeValidator testingInstance = new ShapeValidator();
    @Test
    public void test1()
    {
        boolean actual = testingInstance.validate(5, 5, 4.5);
        boolean expected = true;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2()
    {
        boolean actual = testingInstance.validate(-5, 5, 4.5);
        boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }
}