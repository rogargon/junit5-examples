import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveExtremsStringTest {
    @Test
    void given_a_null_returns_null() {
        assertNull(RemoveExtremsString.removeExtrems(null));
    }

    @Test
    void given_an_empty_string_returns_null() {
        assertNull(RemoveExtremsString.removeExtrems(""));
    }

    @Test
    void given_a_string_of_length_one_returns_null() {
        assertNull(RemoveExtremsString.removeExtrems("a"));
    }

    @Test
    void given_a_string_of_length_two_returns_the_empty_string() {
        assertEquals("", RemoveExtremsString.removeExtrems("ab"));
    }

    @Test
    void normal_case() {
        assertEquals("bcde", RemoveExtremsString.removeExtrems("abcdef"));
    }
}