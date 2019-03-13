public class RemoveExtremsString {

    /*
    Rules:
        - if parameter is null or has length less than 2, return null
        - otherwise, remove the first and last characters from the given string
     */

    public static String removeExtrems(String str) {
        if (str == null || str.length() < 2) {
            return null;
        } else {
            return str.substring(1, str.length() - 1);
        }
    }
}
