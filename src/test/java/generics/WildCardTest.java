package generics;

import khodro.Kashti;
import khodro.Khodro;
import khodro.mashin.Mashin;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class WildCardTest {

    @Test
    void should_print_names() {
        List<Khodro> khodroha = asList(new Mashin("Nissan"), new Kashti());
        printName(khodroha);

        List<Mashin> mashinha = asList(new Mashin("Pejo"), new Mashin("Benz"));
        printName(mashinha);
    }

    private void printName(List<? extends Khodro> khodroha) {
        for (Khodro khodro : khodroha) {
            System.out.println(khodro.getMark());
        }
    }
}
