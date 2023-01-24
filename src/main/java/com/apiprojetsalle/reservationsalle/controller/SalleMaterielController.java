package com.apiprojetsalle.reservationsalle.controller;

import com.apiprojetsalle.reservationsalle.model.SalleMateriel;
import com.apiprojetsalle.reservationsalle.service.SalleMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class SalleMaterielController {


    @Autowired
    public SalleMaterielService salleMaterielService;

    @RequestMapping(value = "/salles_materiels", method = RequestMethod.GET)
    public List<SalleMateriel> getAllSalleMateriels() {

        List<SalleMateriel> salleMateriels = new ArrayList<>();

        try {
            salleMateriels = this.salleMaterielService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return salleMateriels;

    }

    @RequestMapping(value = "/salle_materiel/{id}", method = RequestMethod.GET)
    public SalleMateriel getOneSalleMateriel(@PathVariable Long id) {

        SalleMateriel salleMateriel = new SalleMateriel();

        try {
            salleMateriel = this.salleMaterielService.findById(id);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return salleMateriel;
    }

    @RequestMapping(value = "/salle_materiel/ajouter", method = RequestMethod.POST, headers = "accept=Application/json")
    public SalleMateriel saveSalleMateriel(@RequestBody SalleMateriel salleMateriel) {

        try {
            salleMateriel = this.salleMaterielService.save(salleMateriel);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return salleMateriel;
    }

    @RequestMapping(value = "/salle_materiel/modifier/{id}", method = RequestMethod.PUT, headers = "accept=Application/json")
    public SalleMateriel updateSalleMateriel(@RequestBody SalleMateriel salleMateriel) {

        try {
            salleMateriel = this.salleMaterielService.update(salleMateriel);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return salleMateriel;

    }

    @RequestMapping(value = "/salle_materiel/supprimer/{id}", method = RequestMethod.DELETE, headers = "accept=Application/json")
    public void deleteSalleMateriel(@PathVariable Long id) {
        this.salleMaterielService.deleteById(id);
    }
}
