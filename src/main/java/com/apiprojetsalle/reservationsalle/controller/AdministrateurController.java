package com.apiprojetsalle.reservationsalle.controller;


import com.apiprojetsalle.reservationsalle.model.Administrateur;
import com.apiprojetsalle.reservationsalle.service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class AdministrateurController {

    @Autowired
    public AdministrateurService administrateurService;

    @RequestMapping(value = "/admins", method = RequestMethod.GET)
    public List<Administrateur> getAllAdministrateurs() {

        List<Administrateur> administrateurs = new ArrayList<>();

        try {
            administrateurs = this.administrateurService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return administrateurs;

    }

    @RequestMapping(value = "/admin/{id}", method = RequestMethod.GET)
    public Administrateur getOneAdmin(@PathVariable Long id) {

        Administrateur administrateur = new Administrateur();

        try {
            administrateur = this.administrateurService.findById(id);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return administrateur;
    }

    @RequestMapping(value = "/admin/ajouter", method = RequestMethod.POST, headers = "accept=Application/json")
    public Administrateur saveAdmin(@RequestBody Administrateur administrateur) {

        try {
            administrateur = this.administrateurService.save(administrateur);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return administrateur;
    }

    @RequestMapping(value = "/admin/modifier/{id}", method = RequestMethod.PUT, headers = "accept=Application/json")
    public Administrateur updateAdmin(@RequestBody Administrateur administrateur, @PathVariable  int id) {

        try {
            administrateur = this.administrateurService.update(administrateur);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return administrateur;

    }

    @RequestMapping(value = "/admin/supprimer/{id}", method = RequestMethod.DELETE, headers = "accept=Application/json")
    public void deleteAdmin(@PathVariable Long id) {
        this.administrateurService.deleteById(id);
    }
}
