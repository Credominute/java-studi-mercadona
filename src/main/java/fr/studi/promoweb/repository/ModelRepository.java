package fr.studi.promoweb.repository;

import fr.studi.promoweb.model.Model;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.ArrayList;
import java.util.List;

@RepositoryRestController
public class ModelRepository {
    private static final List<Model> listeDesModeles = new ArrayList<>();

    static {
        listeDesModeles.add(new Model(1, "Samsung", 700));
        listeDesModeles.add(new Model(2, "Iphone", 1200));
        listeDesModeles.add(new Model(3, "Huawei", 650));
    }

    public Model findModelById(int modelID) {
        for (Model model : listeDesModeles) {
            if (model.getModelId() == modelID) {
                return model;
            }
        }
        return null;
    }

}
