package collection.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ListTest {

    @Test
    void Should_Be_Empty_When_Created() {
        List<String> strings = new ArrayList<>();

        assertThat(strings).isEmpty();
    }

    @Test
    void Should_Sort_A_List() {
        List<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");

        Collections.sort(animals);

        LinkedList<String> sortedAnimals = new LinkedList<>();
        sortedAnimals.add("Cat");
        sortedAnimals.add("Cat");
        sortedAnimals.add("Cat");
        sortedAnimals.add("Dog");
        sortedAnimals.add("Rabbit");
        assertThat(animals).isEqualTo(sortedAnimals);
    }

    @Test
    void Should_Be_Immutable() {
        List<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");

        List<String> unmodifiableAnimals = Collections.unmodifiableList(animals);
        //unmodifiableAnimals.add("Snake");     Does not work
        animals.add("Snake");                   // Work

        assertThat(animals.size()).isEqualTo(6);
        assertThat(unmodifiableAnimals.size()).isEqualTo(6);
    }

    @Test
    void Should_Reverse_A_List() {
        List<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");

        Collections.reverse(animals);

        List<String> reversedAnimals = new ArrayList<>();
        reversedAnimals.add("Rabbit");
        reversedAnimals.add("Cat");    // index = 1
        reversedAnimals.add("Cat");    // index = 2
        reversedAnimals.add("Cat");    // index = 3
        reversedAnimals.add("Dog");
        assertThat(animals).isEqualTo(reversedAnimals);
        assertThat(reversedAnimals.indexOf("Cat")).isEqualTo(1);
        assertThat(reversedAnimals.lastIndexOf("Cat")).isEqualTo(3);
        assertThat(reversedAnimals.contains("Dog")).isTrue();
    }

    @Test
    void Given_an_array_return_an_ArrayList_of_the_appropriate_type_with_all_the_same_elements() {
        // Given
        int[] arrayNumbers = {1, 2, 3, 3};

        // When
        Converter converter = new Converter();
        List<Integer> arrayListNumbers = converter.convertToArrayList(arrayNumbers);
        arrayListNumbers.add(4, 99);
        arrayListNumbers.add(2, 66);
        arrayListNumbers.remove(1);
        arrayListNumbers.add(111);

        // Then
        List<Integer> expectedList = new LinkedList<>();
        expectedList.add(1);    // index 0
        //expectedList.add(2);    // index 1
        expectedList.add(66);   // index 2
        expectedList.add(3);    // index 3
        expectedList.add(3);    // index 4
        expectedList.add(99);   // index 5
        expectedList.add(111);
        assertThat(arrayListNumbers).isEqualTo(expectedList);
    }

    class Converter {

        public List<Integer> convertToArrayList(int[] arrayNumbers) {
            List<Integer> listNumbers = new LinkedList<>();
            for (int number : arrayNumbers) {
                listNumbers.add(number);
            }
            return listNumbers;
        }
    }
}
