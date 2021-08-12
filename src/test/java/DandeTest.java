import khodro.mashin.Dande;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class DandeTest {

    @Test
    void print_all_Dande_values() {
        Dande.print();
    }

    @Test
    void print_all_in_persian() {
        out.println("IN PERSIAN :");
        Dande.printInPersian();
    }

    @Test
    void print_all_in_french() {
        out.println("IN FRENCH :");
        Dande.printInFrench();
    }
}
