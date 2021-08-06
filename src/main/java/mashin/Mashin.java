package mashin;

import static java.lang.System.out;

public class Mashin {

    // Dade :
    boolean ayaMashinRoshanAst; // false
    boolean ayaDarMashinBazAst; // false
    String mark;
    Ranande ranande;

    // Constructor
    public Mashin() {
        out.println("Yek mashin.Mashin bedone Dade Sakhte Shod");
    }

    public Mashin(String mark) {
        this.mark = mark;
        out.println("Yek mashine " + this.mark + " sakhte shod");
    }

    // Tabe (methode) :
    public void roshan() {
        out.println("mashin.Mashin roshan ast");
        ayaMashinRoshanAst = true;
    }

    void khamoush() {
        out.println("mashin.Mashin khamoush ast");
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

    public boolean ayaMshinDarHaleHarekatAst() {
        // dar baste bashad va mashin roshan bashad (rule)
        if (!ayaDarMashinBazAst && ayaMashinRoshanAst) {
            out.println("MashinDarHaleHarekatAst");
            return true;
        } else {
            out.println("mashin.Mashin Park ast");
            return false;
        }
    }
}
