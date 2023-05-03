package fr.studi.promoweb.service.impl;

import fr.studi.promoweb.pojo.Produit;
import fr.studi.promoweb.repository.ProduitRepository;
import fr.studi.promoweb.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public List<Produit> getAllProduit(){
        return produitRepository.findAllProduit();
    }

    @Override
    public Produit getProduitById(Long id){
        return produitRepository.findById(id).orElse(null);
    }
}