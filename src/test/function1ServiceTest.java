package test;

import org.junit.jupiter.api.Test;
import service.function1Service;

import static org.junit.jupiter.api.Assertions.*;

class function1ServiceTest {
    function1Service testingInstance;

    @Test
    public void test1()
    {
        testingInstance = new function1Service(6);
        double actual = testingInstance.calcResult();
        double expected = -9.0;
        assertEquals(actual, expected);
    }

    @Test
    public void test2()
    {
        testingInstance = new function1Service(2);
        double actual = testingInstance.calcResult();
        double expected = 0.5;
        assertEquals(actual, expected);
    }
}