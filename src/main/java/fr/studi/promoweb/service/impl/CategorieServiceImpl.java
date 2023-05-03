package fr.studi.promoweb.service.impl;

import fr.studi.promoweb.pojo.Categorie;
import fr.studi.promoweb.repository.CategorieRepository;
import fr.studi.promoweb.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategorieServiceImpl implements CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public List<Categorie> getAllCategorie(){
        return categorieRepository.findAllCategorie();
    }

    @Override
    public Categorie getCategorieById(Long id){
        return categorieRepository.findById(id).orElse(null);
    }
}
