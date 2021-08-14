package khodro;

import khodro.Ranande;
import org.junit.jupiter.api.Test;

public class RanandeTest {

    @Test
    void Bayad_Noe_Gavahiname_Va_Nam_Ra_Chap_Konad() {
        Ranande ranande = new Ranande();
        Ranande.Gavahiname gavahiname = ranande.new Gavahiname();
        gavahiname.print();
    }

    @Test
    void Bayad_Nam_Ra_Chap_Konad() {
        Ranande.StaticGavahiname staticGavahiname = new Ranande.StaticGavahiname();
        staticGavahiname.print();
    }
}
