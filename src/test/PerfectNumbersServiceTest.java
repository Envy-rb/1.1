package test;

import org.junit.jupiter.api.Test;
import service.PerfectNumbersService;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersServiceTest {
    PerfectNumbersService testingInstance = new PerfectNumbersService();

    @Test
    public void test1()
    {
        boolean actual = testingInstance.calcResult(6);
        assertTrue(actual);
    }

    @Test
    public void test2()
    {
        boolean actual = testingInstance.calcResult(2);
        assertFalse(actual);
    }

}