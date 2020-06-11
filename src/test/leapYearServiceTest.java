package test;

import exception.globalException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.leapYearService;

class leapYearServiceTest {
    leapYearService testingInstance;
    @Test
    public void test1() throws globalException {
        testingInstance = new leapYearService(2020, 3);
        String actual = testingInstance.result();
        String expected = "true 31";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2() throws globalException {
        testingInstance = new leapYearService(2021, 9);
        String actual = testingInstance.result();
        String expected = "false 30";
        Assertions.assertEquals(actual, expected);
    }
}