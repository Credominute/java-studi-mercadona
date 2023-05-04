package fr.studi.promoweb.service;

import fr.studi.promoweb.pojo.Categorie;
import fr.studi.promoweb.pojo.Produit;

import java.util.List;

public interface ProduitService {
    List<Produit> getAllProduit();

    List<Produit> getAllProduitByCategorie(Categorie categorie);

    Produit getProduitById(Long id);
}