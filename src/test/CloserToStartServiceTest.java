package test;

import entity.Point;
import org.junit.jupiter.api.Test;
import service.CloserToStartService;

import static org.junit.jupiter.api.Assertions.*;

class CloserToStartServiceTest {
    CloserToStartService testingInstance = new CloserToStartService();;

    @Test
    public void test1()
    {
        Point point1 =  new Point(2,5);
        Point point2 =  new Point(3,3);
        int actual = testingInstance.calcResult(point1, point2);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void test2()
    {
        Point point1 =  new Point(-2, -2);
        Point point2 =  new Point(5,6);
        int actual = testingInstance.calcResult(point1, point2);
        int expected = 1;
        assertEquals(actual, expected);
    }
}