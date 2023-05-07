package fr.studi.promoweb.service.impl;

import fr.studi.promoweb.pojo.Categorie;
import fr.studi.promoweb.pojo.Promotion;
import fr.studi.promoweb.repository.PromotionRepository;
import fr.studi.promoweb.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PromotionServiceImpl implements PromotionService {

    @Autowired
    private PromotionRepository promotionRepository;

    @Override
    public List<Promotion> getAllPromotion(){
        return promotionRepository.findAllPromotion();
    }

    @Override
    public Promotion getPromotionById(Long id){
        return promotionRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePromotionById(Long id){
        promotionRepository.deleteById(id);
    }
    @Override
    public void updatePromotionById(Promotion promotion, Long id){
        Promotion oldPromotion = getPromotionById(id);

        if(oldPromotion != null){
            oldPromotion.setPourcentageRemise(promotion.getPourcentageRemise());
            promotionRepository.save(oldPromotion);
        }
    }

    @Override
    public void createPromotion(Promotion promotion){
        promotionRepository.save(promotion);
    }
}
