package khodro;

import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NamKhodroChapKonTest {

    @Test
    void Bayad_Nam_Khodro_Ra_Chap_Konad() {
        // Given
        Khodro benz = new Mashin("Benz", 120, Dande.AUTOMATIC);
        Khodro volvo = new Mashin("Volvo", 80, Dande.MANUAL);
        Khodro motor = new Motor();
        Khodro kashti = new Kashti();
        Khodro[] khodroha = {benz, volvo, motor, kashti};
        NamKhodroChapKon namKhodroChapKon = new NamKhodroChapKon(khodroha);

        // When
        String listNamKhodroha = namKhodroChapKon.execute();

        // Then
        assertEquals("Benz-Volvo-Motor-Kashti", listNamKhodroha);
    }
}
