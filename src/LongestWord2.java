import java.util.StringTokenizer;

public class LongestWord2 {

    // This version returns null when no word is present in the line
    public String longestWord(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line, " .,;:0123456789");
        String longest = null;
        while (tokenizer.hasMoreTokens()) {
            String current = tokenizer.nextToken();
            if (longest == null || current.length() > longest.length()) {
                longest = current;
            }
        }
        return longest;
    }
}
