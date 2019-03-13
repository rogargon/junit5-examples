import java.util.StringTokenizer;

public class LongestWord1 {
    public String longestWord(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line, " .,;:0123456789");
        String longest = "";
        while (tokenizer.hasMoreTokens()) {
            String current = tokenizer.nextToken();
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        return longest;
    }
}
