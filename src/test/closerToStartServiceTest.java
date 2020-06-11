package test;

import entity.point;
import org.junit.jupiter.api.Test;
import service.closerToStartService;

import static org.junit.jupiter.api.Assertions.*;

class closerToStartServiceTest {
    closerToStartService testingInstance;

    @Test
    public void test1()
    {
        point point1 =  new point(2,5);
        point point2 =  new point(3,3);
        testingInstance = new closerToStartService(point1, point2);
        int actual = testingInstance.calcResult();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void test2()
    {
        point point1 =  new point(-2, -2);
        point point2 =  new point(5,6);
        testingInstance = new closerToStartService(point1, point2);
        int actual = testingInstance.calcResult();
        int expected = 1;
        assertEquals(actual, expected);
    }
}