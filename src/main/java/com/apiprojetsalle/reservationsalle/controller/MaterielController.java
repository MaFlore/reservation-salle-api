package com.apiprojetsalle.reservationsalle.controller;

import com.apiprojetsalle.reservationsalle.model.Materiel;
import com.apiprojetsalle.reservationsalle.service.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class MaterielController {

    @Autowired
    public MaterielService materielService;

    @RequestMapping(value = "/materiels", method = RequestMethod.GET)
    public List<Materiel> getAllMateriels() {

        List<Materiel> materiels = new ArrayList<>();

        try {
            materiels = this.materielService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return materiels;

    }

    @RequestMapping(value = "/materiel/{id}", method = RequestMethod.GET)
    public Materiel getOneMateriel(@PathVariable Long id) {

        Materiel materiel = new Materiel();

        try {
            materiel = this.materielService.findById(id);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return materiel;
    }

    @RequestMapping(value = "/materiel/ajouter", method = RequestMethod.POST, headers = "accept=Application/json")
    public Materiel saveMateriel(@RequestBody Materiel materiel) {

        try {
            materiel = this.materielService.save(materiel);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return materiel;
    }

    @RequestMapping(value = "/materiel/modifier/{id}", method = RequestMethod.PUT, headers = "accept=Application/json")
    public Materiel updateMateriel(@RequestBody Materiel materiel, @PathVariable  int id) {

        try {
            materiel = this.materielService.update(materiel);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return materiel;

    }

    @RequestMapping(value = "/materiel/supprimer/{id}", method = RequestMethod.DELETE, headers = "accept=Application/json")
    public void deleteMateriel(@PathVariable Long id) {
        this.materielService.deleteById(id);
    }
}
