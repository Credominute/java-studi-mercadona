package fr.studi.promoweb.service;

import fr.studi.promoweb.pojo.Produit;

import java.util.List;

public interface ProduitService {
    List<Produit> getAllProduit();

    Produit getProduitById(Long id);
}