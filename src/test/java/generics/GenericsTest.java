package generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericsTest {

    @Test
    void should_works_but_have_errors_in_runtime() {
        List list = new ArrayList();
        list.add(10);
        list.add("10");

        assertThat((Integer) list.get(1)).isNotNull();
    }

    @Test
    void should_works() {
        List<Number> list = new ArrayList<>();
        list.add(5);

        final Integer[] integers = list.toArray(new Integer[0]);

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    @Test
    void generic_method_syntax() {
        GenericMethod<Integer> gt = new GenericMethod<>();
        final Integer[] integers = gt.toArray(new Integer[0], "s");
    }

    static class GenericMethod<E> {
        <S, T extends E> T[] toArray(T[] a, S s) {
            return null;
        }
    }
}
