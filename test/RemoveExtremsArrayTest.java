import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveExtremsArrayTest {
    @Test
    void given_a_null_returns_null() {
        assertNull(RemoveExtremsArray.removeExtrems(null));
    }

    @Test
    void given_an_empty_string_returns_null() {
        assertNull(RemoveExtremsArray.removeExtrems(new char[] {}));
    }

    @Test
    void given_a_string_of_length_one_returns_null() {
        assertNull(RemoveExtremsArray.removeExtrems(new char[] {'a'}));
    }

    @Test
    void given_a_string_of_length_two_returns_the_empty_string() {
        assertArrayEquals(
                new char[] {},
                RemoveExtremsArray.removeExtrems(
                        new char[] {'a', 'b'}));
    }

    @Test
    void normal_case() {
        assertArrayEquals(
                new char[]{'b', 'c', 'd', 'e'},
                RemoveExtremsArray.removeExtrems(
                        new char[]{'a', 'b', 'c', 'd', 'e', 'f'}));
    }
}