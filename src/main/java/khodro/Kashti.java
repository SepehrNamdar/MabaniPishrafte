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

    // Overloading method ba taghir type parametr vorodi : Object -> String
    public void printReferenceObject(String object) {
        out.println(object);
    }

    // Overloading method ba taghir tedad parametr vorodi
    public void printReferenceObject(String object, int newParam) {
        out.println(object);
    }

    // Overloading kar nemikone agar type bargashty method taghir kone
//    public String printReferenceObject(String object, int newParam) {
//        return "";
//    }
}
