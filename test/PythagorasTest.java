import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PythagorasTest {

    private static final double DELTA = 0.00000001;

    // For double and float one should control the accuracy of comparation

    @Test
    void degenerate_cases() {
        assertEquals(0.0, Pythagoras.hypotenuse(0.0, 0.0), DELTA);
        assertEquals(5.0, Pythagoras.hypotenuse(0.0, 5.0), DELTA);
        assertEquals(5.0, Pythagoras.hypotenuse(5.0, 0.0), DELTA);
    }

    @Test
    void normal_triangle() {
        assertEquals(5.0, Pythagoras.hypotenuse(3.0, 4.0), DELTA);
    }
}