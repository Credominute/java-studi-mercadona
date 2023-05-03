package fr.studi.promoweb.service;

import fr.studi.promoweb.pojo.Promotion;

import java.util.List;

public interface PromotionService {
    List<Promotion> getAllPromotion();

    Promotion getPromotionById(Long id);
}
