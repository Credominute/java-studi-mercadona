package fr.studi.promoweb;

import fr.studi.promoweb.controller.ModelController;
import fr.studi.promoweb.model.Model;
import fr.studi.promoweb.repository.ModelRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static fr.studi.promoweb.PromoApplication.dureePromotion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class PromoApplicationTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    @Test
    public void dureePromotionTest() {
        assertEquals(3, dureePromotion(4, 1));
    }

    @InjectMocks
    private final ModelController modelController = new ModelController();
    @Mock
    private ModelRepository modelRepository;
    @Test
    public void testGetModelById() {
        when(modelRepository.findModelById(2))
                .thenReturn(new Model(2, "Iphone", 700));
        assertThat(modelController.getModelById(2).getMarque(),
                is("Iphone"));
    }
}
