package khodro.mashin;

import static java.lang.System.out;

public enum Dande {
    AUTOMATIC("Otomatik", "Automatique"),
    MANUAL("Dasti", "Manuel");

    // Dade
    private final String toPersian;
    private final String toFrench;

    // Constructor
    Dande(String toPersian, String toFrench) {
        this.toPersian = toPersian;
        this.toFrench = toFrench;
    }

    // Method
    public static void print() {
        Dande[] values = Dande.values();
        for (int index = 0; index < values.length; index++) {
            out.println(values[index]);
        }
    }

    public static void printInPersian() {
        Dande[] values = Dande.values();
        for (int index = 0; index < values.length; index++) {
            Dande value = values[index];
            out.println(value.toPersian);
        }
    }

    public static void printInFrench() {
        Dande[] values = Dande.values();
        for (int index = 0; index < values.length; index++) {
            Dande value = values[index];
            out.println(value.toFrench);
        }
    }

    public String toPersian() {
        return toPersian;
    }

    public String toFrench() {
        return toFrench;
    }
}
