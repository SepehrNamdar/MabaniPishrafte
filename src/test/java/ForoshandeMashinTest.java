import foroshande.Foroshande;
import khodro.mashin.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForoshandeMashinTest {

    @Test
    void Bayad_Tedade_Kol_Mashin_Haye_Forokhte_Shode_Ra_Be_Dst_Avarim() {
        Foroshande ali = new Foroshande();
        Foroshande naser = new Foroshande();

        ali.foroshMashin();
        ali.foroshMashin();
        ali.foroshMashin();
        ali.foroshMashin();
        naser.foroshMashin();

        Assertions.assertEquals(5, Mashin.tedadeForosh);
    }
}
