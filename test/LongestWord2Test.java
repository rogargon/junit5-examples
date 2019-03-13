import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestWord2Test {

    @Test
    void given_no_words_returns_null() {
        LongestWord2 lw = new LongestWord2();
        assertNull(lw.longestWord("      "));
    }

    @Test
    void given_only_one_word_returns_the_word() {
        LongestWord2 lw = new LongestWord2();
        assertEquals("patata", lw.longestWord("  patata    "));
    }

    @Test
    void given_diferent_lengths_returns_word_of_maxlength() {
        LongestWord2 lw = new LongestWord2();
        assertEquals("patata", lw.longestWord("la patata brava"));
    }

    @Test
    void given_many_words_maxlength_returns_the_first_one() {
        LongestWord2 lw = new LongestWord2();
        assertEquals("patata", lw.longestWord("la patata és bonica"));
    }
}