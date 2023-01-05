package exercise;

import java.util.*;

// BEGIN
public class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> book : books) {
            boolean isContains = true;

            for (Map.Entry<String, String> where1 : where.entrySet()) {
                String where1Key = where1.getKey();
                String where1Value = where1.getValue();
                String bookValue = book.get(where1Key);

                if (!where1Value.equals(bookValue)) {
                    isContains = false;
                    break;
                }
            }

            if (isContains)
                result.add(book);

        }
        return result;
    }
}
//END
