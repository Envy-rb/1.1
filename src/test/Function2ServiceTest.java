package test;

import exception.GlobalException;
import org.junit.jupiter.api.Test;
import service.Function2Service;

import static org.junit.jupiter.api.Assertions.*;

class Function2ServiceTest {
    Function2Service testingInstance = new Function2Service();;

    @Test
    public void test1() throws GlobalException {
        assertThrows(GlobalException.class, () -> testingInstance.calcTable(0, 5, 0));
    }

    @Test
    public void test2() throws GlobalException {
        assertDoesNotThrow(() -> testingInstance.calcTable(0, 23, 1));
    }
}