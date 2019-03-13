import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestWord1Test {

    @Test
    void no_words() {
        LongestWord1 lw = new LongestWord1();
        assertEquals("", lw.longestWord("      "));
    }
}