package compare;

import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static khodro.mashin.Dande.AUTOMATIC;
import static org.assertj.core.api.Assertions.assertThat;

public class CompareMashinTest {

    @Test
    void should_compare_mashin() {
        Mashin bmw_1 = new Mashin("BMW", 150, AUTOMATIC);
        Mashin bmw_2 = new Mashin("BMW", 150, AUTOMATIC);

        assertThat(bmw_1.equals(bmw_2)).isTrue();
        assertThat(Objects.equals(bmw_1, bmw_2)).isTrue();
        assertThat(bmw_1).isEqualTo(bmw_2);
    }
}
