package com.apiprojetsalle.reservationsalle.controller;

import com.apiprojetsalle.reservationsalle.model.Evenement;
import com.apiprojetsalle.reservationsalle.service.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EvenementController {

    @Autowired
    public EvenementService evenementService;

    @RequestMapping(value = "/evenements", method = RequestMethod.GET)
    public List<Evenement> getAllEvenements() {

        List<Evenement> evenements = new ArrayList<>();

        try {
            evenements = this.evenementService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return evenements;

    }

    @RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
    public Evenement getOneEvenement(@PathVariable Long id) {

        Evenement evenement = new Evenement();

        try {
            evenement = this.evenementService.findById(id);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return evenement;
    }

    @RequestMapping(value = "/article/ajouter", method = RequestMethod.POST, headers = "accept=Application/json")
    public Evenement saveEvenement(@RequestBody Evenement evenement) {

        try {
            evenement = this.evenementService.save(evenement);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return evenement;
    }

    @RequestMapping(value = "/evenement/modifier/{id}", method = RequestMethod.PUT, headers = "accept=Application/json")
    public Evenement updateEvenement(@RequestBody Evenement evenement, @PathVariable  int id) {

        try {
            evenement = this.evenementService.update(evenement);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return evenement;

    }

    @RequestMapping(value = "/evenement/supprimer/{id}", method = RequestMethod.DELETE, headers = "accept=Application/json")
    public void deleteEvenement(@PathVariable Long id) {
        this.evenementService.deleteById(id);
    }
}
