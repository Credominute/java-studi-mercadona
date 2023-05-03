package fr.studi.promoweb.service.impl;

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
}
