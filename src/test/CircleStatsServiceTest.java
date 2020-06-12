package test;

import exception.GlobalException;
import org.junit.jupiter.api.Test;
import service.CircleStatsService;

import static org.junit.jupiter.api.Assertions.*;

class CircleStatsServiceTest {
    CircleStatsService testingInstance = new CircleStatsService();

    @Test
    public void test1() throws GlobalException {
        double[] actual = testingInstance.getResult(5);
        double[] expected = {31.42, 78.54};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void test2() throws GlobalException {
        double[] actual = testingInstance.getResult(12.4);
        double[] expected = {77.91, 483.05};
        assertArrayEquals(actual, expected);
    }

}