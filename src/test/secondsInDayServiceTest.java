package test;

import exception.globalException;
import org.junit.jupiter.api.Test;
import service.secondsInDayService;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class secondsInDayServiceTest {
    secondsInDayService testingInstance;
    @Test
    public void test1() throws globalException {
        testingInstance = new secondsInDayService(456);
        int[] actual = testingInstance.getResult();
        int[] expected = {0, 7, 36};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void test2() throws globalException {
        testingInstance = new secondsInDayService(5679);
        int[] actual = testingInstance.getResult();
        int[] expected = {1, 34, 39};
        assertArrayEquals(actual, expected);
    }

}