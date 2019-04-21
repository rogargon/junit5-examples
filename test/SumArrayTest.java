import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumArrayTest {

    @Test
    void empty_array() {
        SumArray sumArray = new SumArray();
        int[] empty = new int[] {};
        assertEquals(0, sumArray.sumArray(empty));
    }

    @Test
    void singleton_array() {
        SumArray sumArray = new SumArray();
        int[] singleton = new int[] {4};
        int actual = sumArray.sumArray(singleton);
        assertEquals(4, actual);
    }
}
