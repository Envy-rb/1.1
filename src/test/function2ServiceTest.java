package test;

import exception.globalException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.function2Service;

import static org.junit.jupiter.api.Assertions.*;

class function2ServiceTest {
    function2Service testingInstance;

    @Test
    public void test1() throws globalException {
        testingInstance = new function2Service(0, 5, 0);
        assertThrows(globalException.class, () -> testingInstance.calcTable());
    }

    @Test
    public void test2() throws globalException {
        testingInstance = new function2Service(0, 23, 1);
        assertDoesNotThrow(() -> testingInstance.calcTable());
    }
}