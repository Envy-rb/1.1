package test;

import org.junit.jupiter.api.Test;
import service.Function1Service;

import static org.junit.jupiter.api.Assertions.*;

class Function1ServiceTest {
    Function1Service testingInstance = new Function1Service();

    @Test
    public void test1()
    {
        double actual = testingInstance.calcResult(6);
        double expected = -9.0;
        assertEquals(actual, expected);
    }

    @Test
    public void test2()
    {
        double actual = testingInstance.calcResult(2);
        double expected = 0.5;
        assertEquals(actual, expected);
    }
}