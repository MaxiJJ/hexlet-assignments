package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {

    public static void main(String[] args) {
        String[] emails = {
                "info@yandex.ru",
                "mk@host.com",
                "support@hexlet.io",
                "key@yandex.ru",
                "sergey@gmail.com",
                "vovan@gmail.com",
                "support.yandex.ru@host.com",
                "support.yandex.ru@hexlet.io"
        };

        List<String> emailsList = Arrays.asList(emails);
        System.out.println(getCountOfFreeEmails(emailsList));
    }

    public static int getCountOfFreeEmails(List<String> emails) {
        long count = 0;
        long length = emails.size();

        if (emails != null) {
            count = emails.stream()
                    .filter(email -> !email.contains("@gmail.com"))
                    .filter(email -> !email.contains("@yandex.ru"))
                    .filter(email -> !email.contains("@hotmail.com"))
                    .count();
        }

        return (int) (length - count);
    }
}
// END
