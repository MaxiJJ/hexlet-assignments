package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        String[] current = sentence.split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String s : current) {
            int count = 1;
            if (!s.equals(current)) {
                result.put(s, count);
            } else if (s.equals(current)) {
                count = count + 1;
                result.put(s, count);
            }
        }
        return result;
    }
}
//END
