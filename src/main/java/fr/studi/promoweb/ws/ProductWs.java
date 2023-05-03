package fr.studi.promoweb.ws;

import fr.studi.promoweb.pojo.Produit;
import fr.studi.promoweb.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(ApiRegistration.API_REST
        +ApiRegistration.PRODUIT)
@RestController
public class ProductWs {

    @Autowired
    private ProduitService produitService;

    @GetMapping
    public List<Produit> getAllProduct() {
        return produitService.getAllProduit();
    }

    @GetMapping("{id}")
    public Produit getProductById(@PathVariable("id") Long id) {
        return produitService.getProduitById(id);
    }

    @PostMapping
    public void createProduct(@RequestBody Produit produit) {

    }
}