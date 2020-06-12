package test;

import exception.GlobalException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.InscribedSquareService;

class InscribedSquareTest {
    InscribedSquareService testingInstance = new InscribedSquareService();;
    @Test
    public void test1() throws GlobalException {
        double actual = testingInstance.calcResult(4d);
        double expected = 2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2() throws GlobalException {
        double actual = testingInstance.calcResult(45d);
        double expected = 2;
        Assertions.assertEquals(actual, expected);
    }

}