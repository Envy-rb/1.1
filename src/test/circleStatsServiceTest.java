package test;

import exception.globalException;
import org.junit.jupiter.api.Test;
import service.circleStatsService;

import static org.junit.jupiter.api.Assertions.*;

class circleStatsServiceTest {
    circleStatsService testingInstance;

    @Test
    public void test1() throws globalException {
        testingInstance = new circleStatsService(5);
        double[] actual = testingInstance.getResult();
        double[] expected = {31.42, 78.54};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void test2() throws globalException {
        testingInstance = new circleStatsService(12.4);
        double[] actual = testingInstance.getResult();
        double[] expected = {77.91, 483.05};
        assertArrayEquals(actual, expected);
    }

}