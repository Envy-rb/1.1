package test;

import exception.GlobalException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.GetBoolService;

class GetBoolServiceTest {
    GetBoolService testingInstance = new GetBoolService();;

    @Test
    public void test1() throws GlobalException {
        boolean actual = testingInstance.result(3, 4, 5 ,6);
        boolean expected = true;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2() throws GlobalException {
        boolean actual = testingInstance.result(3, 4, 5 ,1);
        boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }
}