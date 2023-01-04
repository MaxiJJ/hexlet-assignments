package exercise;

import java.util.*;

// BEGIN
public class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : books) {
            if (books.containsAll((Collection<?>) where)) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
