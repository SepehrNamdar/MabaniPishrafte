package collection.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListTest {

    @Test
    void Should_Be_Empty_When_Created() {
        List<String> strings = new ArrayList<>();

        assertThat(strings).isEmpty();
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

        // Then
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(66);
        expectedList.add(3);
        expectedList.add(3);
        expectedList.add(99);
        assertThat(arrayListNumbers).isEqualTo(expectedList);
    }

    class Converter {

        public List<Integer> convertToArrayList(int[] arrayNumbers) {
            List<Integer> listNumbers = new ArrayList<>();
            for (int number : arrayNumbers) {
                listNumbers.add(number);
            }
            return listNumbers;
        }
    }
}
