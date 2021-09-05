package compare;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class CompareObjectsTest {

    @Test
    void should_compare_primitives_objects() {
        assertThat(1 == 1).isTrue();
        assertThat(1 != 2).isTrue();
        assertThat(1.2 == 1.2).isTrue();
    }

    @Test
    void should_compare_non_primitive_objects() {
        String s1 = new String("Sepehr");
        String s2 = new String("Sepehr");

        System.out.println(s1);
        System.out.println(s2);

        assertThat(s1 == s2).isFalse();
        assertThat(s1.equals(s2)).isTrue();

        String s3 = new String("SEPEHR");
        assertThat(s1.equalsIgnoreCase(s3)).isTrue();

        String sep1 = "Sepehr";
        String sep2 = "Sepehr";
        assertThat(sep1 == sep2).isTrue();
    }

    @Test
    void should_handle_null_objects() {
        String sep1 = null;
        String sep2 = "Sepehr";

        //assertThat(sep1.equals(sep2)).isFalse();  // Not support null values
        assertThat(Objects.equals(sep1, sep2)).isFalse();
    }
}
