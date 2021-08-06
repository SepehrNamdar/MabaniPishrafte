import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
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

        // Object Mashin
//        Mashin mashin = new Mashin();
//        mashin.bazKardanDar();
//        mashin.bastanDar();
//
//        System.out.println("Dar Mashin baz ast ?" + mashin.ayaDarMashinBazAst);
//
//        mashin.harekat();
//
//        System.out.println("---------------------------------------");
//
//        Mashin pride = new Mashin("Pride");
//        pride.roshan();
//        pride.bazKardanDar();
//
//        pride.harekat();
    }

    class Mashin {

        // Dade :
        boolean ayaMashinRoshanAst; // false
        boolean ayaDarMashinBazAst; // false
        String mark;

        // Constructor
        Mashin() {
            out.println("Yek Mashin bedone Dade Sakhte Shod");
        }

        Mashin(String mark) {
            this.mark = mark;
            out.println("Yek mashine " + this.mark + " sakhte shod");
        }

        // Tabe (methode) :
        void roshan() {
            out.println("Mashin roshan ast");
            ayaMashinRoshanAst = true;
        }

        void khamoush() {
            out.println("Mashin khamoush ast");
            ayaMashinRoshanAst = false;
        }

        void bazKardanDar() {
            out.println("Dar Baz ast");
            ayaDarMashinBazAst = true;
        }

        void bastanDar() {
            out.println("Dar Baste shod");
            ayaDarMashinBazAst = false;
        }

        boolean ayaMshinDarHaleHarekatAst() {
            // dar baste bashad va mashin roshan bashad (rule)
            if (!ayaDarMashinBazAst && ayaMashinRoshanAst) {
                out.println("MashinDarHaleHarekatAst");
                return true;
            } else {
                out.println("Mashin Park ast");
                return false;
            }
        }

    }

}
