package khodro;

public class Mashin {   // DRY : Don't Reapet Yourself

    boolean ayaRoshanAst; // false
    boolean ayaDarBazAst; // false
    String mark;
    Ranande ranande;

    public Mashin() {
    }

    public Mashin(String mark) {
        this.mark = mark;
    }

    public void roshan() {
        ayaRoshanAst = true;
    }

    void khamoush() {
        ayaRoshanAst = false;
    }

    void bazKardanDar() {
        ayaDarBazAst = true;
    }

    void bastanDar() {
        ayaDarBazAst = false;
    }

    public boolean ayaDarHaleHarekatAst() {
        if (!ayaDarBazAst && ayaRoshanAst) {
            return true;
        } else {
            return false;
        }
    }
}
