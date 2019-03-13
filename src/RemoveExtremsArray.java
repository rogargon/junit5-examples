import java.util.Arrays;

public class RemoveExtremsArray {

    /*
    Rules:
        - if parameter is null or has length less than 2, return null
        - otherwise, remove the first and last characters from the given string
     */

    public static char[] removeExtrems(char[] chars) {
        if (chars == null || chars.length < 2) {
            return null;
        } else {
            return Arrays.copyOfRange(chars, 1, chars.length-1);
        }
    }
}
