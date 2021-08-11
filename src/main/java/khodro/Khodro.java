package khodro;

import static java.lang.System.out;

public abstract class Khodro {

    protected final void protectedMethod() {
        out.println("This method is protected");
    }

    protected boolean ayaRoshanAst;

    public void roshan() {
        ayaRoshanAst = true;
    }

    void khamoush() {
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHaleHarekatAst();

    public abstract String getMark();
}
