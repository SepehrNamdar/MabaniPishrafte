package collection.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;
import static org.assertj.core.api.Assertions.assertThat;

public class MapTest {

    @Test
    void Should_have_unique_keys_and_can_have_duplicated_values() {
        Map<String, String> geometrics = new HashMap<>();   // Key : String, Value : String
        geometrics.put("Mosalas", "Ghermez");   // Duplicated values are allowed
        geometrics.put("Mostatil", "Zard");
        geometrics.put("SheshZelei", "Sabz");
        geometrics.put("Moraba", "Ghermez");    // Duplicated values are allowed
        geometrics.put("Moraba", "Ghermez");    // Duplicated key is not allowed

        Set<Map.Entry<String, String>> entries = geometrics.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            out.println("Key is : " + key + ", Value is : " + value);
        }

        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("Mosalas", "Ghermez");
        expectedMap.put("Mostatil", "Zard");
        expectedMap.put("SheshZelei", "Sabz");
        expectedMap.put("Moraba", "Ghermez");
        assertThat(geometrics).isEqualTo(expectedMap);
    }

    @Test
    void Should_preserve_insertion_order() {
        Map<String, String> geometrics = new LinkedHashMap<>();
        geometrics.put("Mosalas", "Ghermez");
        geometrics.put("Mostatil", "Zard");
        geometrics.put("SheshZelei", "Sabz");
        geometrics.put("Moraba", "Ghermez");

        Set<Map.Entry<String, String>> entries = geometrics.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            out.println("Key is : " + key + ", Value is : " + value);
        }

        Object[] keys = geometrics.keySet().toArray();
        assertThat(keys[0]).isEqualTo("Mosalas");
        assertThat(keys[1]).isEqualTo("Mostatil");
        assertThat(keys[2]).isEqualTo("SheshZelei");
        assertThat(keys[3]).isEqualTo("Moraba");
    }
}
