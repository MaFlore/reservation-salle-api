package com.apiprojetsalle.reservationsalle.controller;

import com.apiprojetsalle.reservationsalle.model.Personne;
import com.apiprojetsalle.reservationsalle.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class PersonneController {

    @Autowired
    public PersonneService personneService;

    @RequestMapping(value = "/personnes", method = RequestMethod.GET)
    public List<Personne> getAllPersonnes() {

        List<Personne> personnes = new ArrayList<>();

        try {
            personnes = this.personneService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return personnes;

    }

    @RequestMapping(value = "/personne/{id}", method = RequestMethod.GET)
    public Personne getOnePersonne(@PathVariable Long id) {

        Personne personne = new Personne();

        try {
            personne = this.personneService.findById(id);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return personne;
    }

    @RequestMapping(value = "/personne/ajouter", method = RequestMethod.POST, headers = "accept=Application/json")
    public Personne savePersonne(@RequestBody Personne personne) {

        try {
            personne = this.personneService.save(personne);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return personne;
    }

    @RequestMapping(value = "/personne/modifier/{id}", method = RequestMethod.PUT, headers = "accept=Application/json")
    public Personne updatePersonne(@RequestBody Personne personne, @PathVariable  int id) {

        try {
            personne = this.personneService.update(personne);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return personne;

    }

    @RequestMapping(value = "/personne/supprimer/{id}", method = RequestMethod.DELETE, headers = "accept=Application/json")
    public void deletePersonne(@PathVariable Long id) {
        this.personneService.deleteById(id);
    }
}
