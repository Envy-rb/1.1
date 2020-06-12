package test;

import exception.GlobalException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.LeapYearService;

class LeapYearServiceTest {
    LeapYearService testingInstance = new LeapYearService();
    @Test
    public void test1() throws GlobalException {
        String actual = testingInstance.calcResult(2020, 3);
        String expected = "true 31";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2() throws GlobalException {
        String actual = testingInstance.calcResult(2021, 9);
        String expected = "false 30";
        Assertions.assertEquals(actual, expected);
    }
}