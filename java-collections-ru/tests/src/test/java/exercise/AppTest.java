package exercise;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        int count = 5;
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 11, 21, 31, 41, 51));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 11, 21, 31, 41));

        List<Integer> current = App.take(elements, count);
        Assertions.assertEquals(expected, current);
        // END
    }
}
