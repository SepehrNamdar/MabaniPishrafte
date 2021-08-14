package collection.set;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.System.out;
import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {

    @Test
    void Should_Remove_Duplication() {
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
    void Should_Maintain_Insertion_Order() {
        Set<String> animals = new LinkedHashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");

        for (String animal : animals) {
            out.println(animal);
        }
    }
}
