package khodro;

import static java.lang.System.out;

public class Kashti extends Khodro {

    @Override
    public String toString() {
        //return "Kashti{}";
        return super.toString();
    }

    @Override
    public boolean ayaDarHaleHarekatAst() {
        protectedMethod();
        return false;
    }

    @Override
    public String getMark() {
        return "Kashti";
    }

    public void printReference() {
        out.println(this.toString());
    }

    public void printReferenceObject(Object object) {
        out.println(object);
    }
}
