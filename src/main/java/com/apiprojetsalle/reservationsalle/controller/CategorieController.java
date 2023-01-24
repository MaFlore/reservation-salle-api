package com.apiprojetsalle.reservationsalle.controller;

import com.apiprojetsalle.reservationsalle.model.Categorie;
import com.apiprojetsalle.reservationsalle.model.Client;
import com.apiprojetsalle.reservationsalle.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CategorieController {

    @Autowired
    public CategorieService categorieService;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Categorie> getAllCategories() {

        List<Categorie> categories = new ArrayList<>();

        try {
            categories = this.categorieService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return categories;

    }

    @RequestMapping(value = "/categorie/{id}", method = RequestMethod.GET)
    public Categorie getOneCategorie(@PathVariable Long id) {

        Categorie categorie = new Categorie();

        try {
            categorie = this.categorieService.findById(id);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return categorie;
    }

    @RequestMapping(value = "/categorie/ajouter", method = RequestMethod.POST, headers = "accept=Application/json")
    public Categorie saveCategorie(@RequestBody Categorie categorie) {

        try {
            categorie = this.categorieService.save(categorie);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return categorie;
    }

    @RequestMapping(value = "/categorie/modifier/{id}", method = RequestMethod.PUT, headers = "accept=Application/json")
    public Categorie updateCategorie(@RequestBody Categorie categorie) {

        try {
            categorie = this.categorieService.update(categorie);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return categorie;

    }

    @RequestMapping(value = "/categorie/supprimer/{id}", method = RequestMethod.DELETE, headers = "accept=Application/json")
    public void deleteCategorie(@PathVariable Long id) {
        this.categorieService.deleteById(id);
    }
}
