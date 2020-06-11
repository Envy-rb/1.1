package test;

import exception.globalException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.inscribedSquareService;

class inscribedSquareTest {
    inscribedSquareService testingInstance;
    @Test
    public void test1() throws globalException {
        testingInstance = new inscribedSquareService(4d);
        double actual = testingInstance.result();
        double expected = 2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2() throws globalException {
        testingInstance = new inscribedSquareService(45d);
        double actual = testingInstance.result();
        double expected = 2;
        Assertions.assertEquals(actual, expected);
    }

}