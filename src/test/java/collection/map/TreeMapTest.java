package collection.map;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import static org.assertj.core.api.Assertions.assertThat;

public class TreeMapTest {

    @Test
    void Should_Sort_Elements() {
        // Given
        Map<String, String> geometrics = new TreeMap<>();
        geometrics.put("Mosalas", "Ghermez");
        geometrics.put("Mostatil", "Zard");
        geometrics.put("SheshZelei", "Sabz");
        geometrics.put("Moraba", "Ghermez");

        // Then
        Object[] keys = geometrics.keySet().toArray();
        assertThat(keys[0]).isEqualTo("Moraba");
        assertThat(keys[1]).isEqualTo("Mosalas");
        assertThat(keys[2]).isEqualTo("Mostatil");
        assertThat(keys[3]).isEqualTo("SheshZelei");
    }

    @Test
    void Should_Sort_Elements_In_Reverse_Order() {
        // Given
        Map<String, String> geometrics = new TreeMap<>(Comparator.reverseOrder());
        geometrics.put("Mosalas", "Ghermez");
        geometrics.put("Mostatil", "Zard");
        geometrics.put("SheshZelei", "Sabz");
        geometrics.put("Moraba", "Ghermez");

        // Then
        Object[] keys = geometrics.keySet().toArray();
        assertThat(keys[0]).isEqualTo("SheshZelei");
        assertThat(keys[1]).isEqualTo("Mostatil");
        assertThat(keys[2]).isEqualTo("Mosalas");
        assertThat(keys[3]).isEqualTo("Moraba");
    }
}
