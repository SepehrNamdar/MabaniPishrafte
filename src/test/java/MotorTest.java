import khodro.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MotorTest {

    @Test
    void Motor_Bayad_Harekat_Konad_Vaghty_Roshan_Ast() {
        Motor motor = new Motor();

        motor.roshan();
        boolean ayaHarekatMikonad = motor.ayaDarHaleHarekatAst();

        assertTrue(ayaHarekatMikonad);
    }
}
