import org.junit.jupiter.api.Test;

public class MashinTest {

    class Mashin {

        // Dade :
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        double toul;
        double arz;
        String mark;

        // Tabe (methode) :
        void roshan() {
            System.out.println("Mashin roshan ast");
            ayaMashinRoshanAst = true;
        }

        void khamoush() {
            System.out.println("Mashin khamoush ast");
            ayaMashinRoshanAst = false;
        }

        void bazKardanDar() {
            System.out.println("Dar Baz ast");
            ayaDarMashinBazAst = true;
        }

        void bastanDar() {
            System.out.println("Dar Baste shod");
            ayaDarMashinBazAst = false;
        }

        void harekat() {
            // dar baste bashad va mashin roshan bashad (rule)
            if (!ayaDarMashinBazAst && ayaMashinRoshanAst) {
                System.out.println("MashinDarHaleHarekatAst");
            } else {
                System.out.println("Mashin Park ast");
            }
        }

    }

}
