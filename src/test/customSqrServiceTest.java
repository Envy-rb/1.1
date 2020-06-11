package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.customSqrService;

class customSqrServiceTest {
    customSqrService testingInstance;
    @Test
    public void test1()
    {
         testingInstance = new customSqrService(16);
         int actual = testingInstance.lastDigitPow();
         int expected = 6;
         Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2()
    {
        testingInstance = new customSqrService(14);
        int actual = testingInstance.lastDigitPow();
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

}