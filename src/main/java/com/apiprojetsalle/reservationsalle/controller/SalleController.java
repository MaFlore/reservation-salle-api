package com.apiprojetsalle.reservationsalle.controller;

import com.apiprojetsalle.reservationsalle.model.Salle;
import com.apiprojetsalle.reservationsalle.service.SalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class SalleController {

    @Autowired
    public SalleService salleService;

    @RequestMapping(value = "/salles", method = RequestMethod.GET)
    public List<Salle> getAllSalles() {

        List<Salle> salles = new ArrayList<>();

        try {
            salles = this.salleService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return salles;

    }

    @RequestMapping(value = "/salle/{id}", method = RequestMethod.GET)
    public Salle getOneSalle(@PathVariable Long id) {

        Salle salle = new Salle();

        try {
            salle = this.salleService.findById(id);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return salle;
    }

    @RequestMapping(value = "/salle/ajouter", method = RequestMethod.POST, headers = "accept=Application/json")
    public Salle saveSalle(@RequestBody Salle salle) {

        try {
            salle = this.salleService.save(salle);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return salle;
    }

    @RequestMapping(value = "/salle/modifier/{id}", method = RequestMethod.PUT, headers = "accept=Application/json")
    public Salle updateSalle(@RequestBody Salle salle) {

        try {
            salle = this.salleService.update(salle);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return salle;

    }

    @RequestMapping(value = "/salle/supprimer/{id}", method = RequestMethod.DELETE, headers = "accept=Application/json")
    public void deleteSalle(@PathVariable Long id) {
        this.salleService.deleteById(id);
    }
}
