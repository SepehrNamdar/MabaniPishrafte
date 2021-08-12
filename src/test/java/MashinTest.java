import khodro.Khodro;
import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MashinTest {

    @Test
    void Mashin_Bayad_Harekat_Konad_Vaghty_Dar_Baste_Ast_Va_Mashin_Roshan_Ast() {
        Khodro benz = new Mashin("Benz");
        Khodro volvo = new Mashin("Volvo");

        boolean ayaHarekatMikonad = benz.ayaDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaDarHaleHarekatAst();

        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekatMikonad);
    }

    @Test
    void Bayad_Print_Konad() {
        Mashin pejo = new Mashin("Pejo", 67, Dande.MANUAL);

        System.out.println(pejo.toString());
    }

}
