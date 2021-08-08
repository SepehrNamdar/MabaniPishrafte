import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {

    @Test
    void Bayad_Amaliat_Riazi_Anjam_Dahad() {
        double moteghayer = -1.5;

        double meghdarMotlagh = Math.abs(moteghayer);

        assertEquals(1.5, meghdarMotlagh);
        assertEquals(1, Math.cos(0));
    }
}
