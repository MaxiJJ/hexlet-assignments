package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {

    public static Map getWordCount(String sentence) {
        String[] current = sentence.split(" ");
        Map result = new HashMap();

        if (sentence.length() == 0) {
            return result;
        }

        for (String s : current) {
            int count = (int) result.getOrDefault(s, 0);
            count += 1;
            result.put(s, count);
        }

        return result;
    }

    public static String toString(Map wordsCount) {
        if (wordsCount.isEmpty()) {
            return "{}";
        }

        StringBuilder result = new StringBuilder("{\n");

        for (Object key : wordsCount.keySet()) {
            result.append("  " + key + ": " + wordsCount.get(key) + "\n");
        }

        result.append("}");

        return result.toString();
    }
}
//END
