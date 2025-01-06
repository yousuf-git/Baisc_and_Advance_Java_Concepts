import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+");
        // \\d+ is a regular expression that matches one or more digits
        
        // Pattern pattern = Pattern.compile("\\d");
        // \\d is a regular expression that matches a single digit
        
        Matcher matcher = pattern.matcher("123abc456");
        // The matcher object is created from the pattern object and the input string

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
