package test;

import exception.GlobalException;
import org.junit.jupiter.api.Test;
import service.SecondsInDayService;

import static org.junit.jupiter.api.Assertions.*;

class SecondsInDayServiceTest {
    SecondsInDayService testingInstance = new SecondsInDayService();
    @Test
    public void test1() throws GlobalException {
        int[] actual = testingInstance.getResult(456);
        int[] expected = {0, 7, 36};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void test2() throws GlobalException {
        int[] actual = testingInstance.getResult(5679);
        int[] expected = {1, 34, 39};
        assertArrayEquals(actual, expected);
    }

}