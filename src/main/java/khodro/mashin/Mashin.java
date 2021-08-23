package khodro.mashin;

import khodro.Gearbox;
import khodro.Khodro;
import khodro.Ranande;
import khodro.SandoghDar;

import java.util.Objects;

// Mashin yek khodro ast : Car is a Vehicle
public class Mashin extends Khodro implements SandoghDar, Gearbox {

    public static int tedadeForosh;

    private boolean ayaDarBazAst; // false
    private String mark;
    private int gonjayeshSandogh;
    private Dande noeDande;
    private Ranande ranande;

    public Mashin() {
    }

    public Mashin(String mark) {
        this.mark = mark;
    }

    public Mashin(String mark, int gonjayeshSandogh, Dande noeDande) {
        this.mark = mark;
        this.gonjayeshSandogh = gonjayeshSandogh;
        this.noeDande = noeDande;
    }

    void bazKardanDar() {
        ayaDarBazAst = true;
    }

    void bastanDar() {
        ayaDarBazAst = false;
    }

    @Override
    public boolean ayaDarHaleHarekatAst() {
        protectedMethod();
        if (!ayaDarBazAst && ayaRoshanAst) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getMark() {
        return mark;
    }

    @Override
    public Dande typeDande() {
        return noeDande;
    }

    @Override
    public int gonjayeshSandogh() {
        return gonjayeshSandogh;
    }

    @Override
    public String toString() {
        return "Mashin{" +
                "ayaDarBazAst=" + this.ayaDarBazAst +
                ", mark='" + this.mark + '\'' +
                ", gonjayeshSandogh=" + this.gonjayeshSandogh +
                ", noeDande='" + this.noeDande.toPersian() + " - " + this.noeDande.toFrench() + '\'' +
                ", ranande=" + this.ranande +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mashin mashin = (Mashin) o;
        return gonjayeshSandogh == mashin.gonjayeshSandogh
                && Objects.equals(mark, mashin.mark)
                && noeDande == mashin.noeDande;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, gonjayeshSandogh, noeDande);
    }
}
