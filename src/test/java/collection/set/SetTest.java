package collection.set;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.out;
import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {

    @Test
    void HashSet_Should_Remove_Duplication() {
        Set<String> animals = new HashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");

        Set<String> expectedAnimals = new HashSet<>();
        expectedAnimals.add("Dog");
        expectedAnimals.add("Cat");
        expectedAnimals.add("Rabbit");
        assertThat(animals).isEqualTo(expectedAnimals);

        for (String animal : animals) {
            out.println(animal);
        }
    }

    @Test
    void LinkedHashSet_Should_Maintain_Insertion_Order() {
        Set<String> animals = new LinkedHashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");

        for (String animal : animals) {
            out.println(animal);
        }
    }

    @Test
    void TreeSet_Should_Sort_Data() {
        Set<String> animals = new TreeSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");

        for (String animal : animals) {
            out.println(animal);
        }
    }
}
