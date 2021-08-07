package khodro;

public abstract class Khodro {

    boolean ayaRoshanAst;

    public void roshan() {
        ayaRoshanAst = true;
    }

    void khamoush() {
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHaleHarekatAst();

    public abstract String getMark();
}
