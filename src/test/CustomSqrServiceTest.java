package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.CustomSqrService;

class CustomSqrServiceTest {
    CustomSqrService testingInstance = new CustomSqrService();
    @Test
    public void test1()
    {
         int actual = testingInstance.lastDigitPow(16);
         int expected = 6;
         Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2()
    {
        int actual = testingInstance.lastDigitPow(14);
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

}