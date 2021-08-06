import mashin.Mashin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MashinTest {

    @Test
    void Mashin_Bayad_Harekat_Konad_Vaghty_Dar_Baste_Ast_Va_Mashin_Roshan_Ast() {
        // Given
        Mashin benz = new Mashin("Benz");
        Mashin volvo = new Mashin("Volvo");

        // When
        boolean ayaHarekatMikonad = benz.ayaMshinDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaMshinDarHaleHarekatAst();

        // Then
        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekatMikonad);
    }

}
