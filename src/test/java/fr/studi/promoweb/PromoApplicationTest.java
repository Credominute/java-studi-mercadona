package fr.studi.promoweb;

import org.junit.jupiter.api.Test;
import static fr.studi.promoweb.PromoApplication.dureePromotion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PromoApplicationTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    @Test
    public void dureePromotionTest() {
        assertEquals(3, dureePromotion(4, 1));
    }
}
