package khodro;

// Mashin yek khodro ast : Car is a Vehicle
public class Mashin extends Khodro {   // DRY : Don't Repeat Yourself

    boolean ayaDarBazAst; // false
    String mark;
    Ranande ranande;

    public Mashin() {
    }

    public Mashin(String mark) {
        this.mark = mark;
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
