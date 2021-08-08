package khodro;

public class NamKhodroChapKon { // Open Close principle // Dependency Injection

    Khodro[] khodroha;

    // Constructor
    public NamKhodroChapKon(Khodro[] khodroha) {
        this.khodroha = khodroha;
    }

    public String execute() {
        String nameKhodroha = "";

        for ( int neshaneGar = 0;  neshaneGar < khodroha.length; neshaneGar++) {
            Khodro khodro = khodroha[neshaneGar];
            if (neshaneGar != khodroha.length - 1) {
                nameKhodroha = nameKhodroha + khodro.getMark() + "-";
            } else {
                nameKhodroha = nameKhodroha + khodro.getMark();
            }
        }

        return nameKhodroha;
    }
}
