package khodro;

import khodro.jadid.Mashin;

public class Kashti extends Khodro {
    @Override
    public boolean ayaDarHaleHarekatAst() {
        protectedMethod();
        Mashin mashin = new Mashin();
        return false;
    }

    @Override
    public String getMark() {
        return "Kashti";
    }
}
