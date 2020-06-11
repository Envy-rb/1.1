package test;

import exception.globalException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.getBoolService;

import static org.junit.jupiter.api.Assertions.*;

class getBoolServiceTest {
    getBoolService testingInstance;

    @Test
    public void test1() throws globalException {
        testingInstance = new getBoolService(3, 4, 5 ,6);
        boolean actual = testingInstance.result();
        boolean expected = true;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2() throws globalException {
        testingInstance = new getBoolService(3, 4, 5 ,1);
        boolean actual = testingInstance.result();
        boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }
}