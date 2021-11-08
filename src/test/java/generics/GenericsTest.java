package generics;

import org.assertj.core.api.Assertions;
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
}
