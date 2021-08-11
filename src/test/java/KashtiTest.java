import khodro.Kashti;
import khodro.Khodro;
import org.junit.jupiter.api.Test;

public class KashtiTest {

    @Test
    void final_method() {
        Khodro kashti = new Kashti();

        kashti.ayaDarHaleHarekatAst();
    }

    @Test
    void super_keyword() {
        Khodro kashti = new Kashti();

        System.out.println(kashti.toString());
    }
}
