package khodro;

public abstract class Khodro {

    protected void protectedMethod() {
        System.out.println("Thid method is protected");
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
