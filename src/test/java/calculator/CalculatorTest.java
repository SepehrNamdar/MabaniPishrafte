package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Jam_Konad() {
        Calculator calculator = new Calculator();

        String haselJamDoAdad = calculator.add("5.3", "-2");

        assertEquals("3.3", haselJamDoAdad);
    }

    @Test
    void Bayad_NumberFormatException_Ijad_Kojnad_Agr_Adad_Sahih_Nistand() {
        Calculator calculator = new Calculator();

        Assertions.assertThatExceptionOfType(NumberFormatException.class)
                .isThrownBy(() -> calculator.add("5......3", "-2"));
    }
}
