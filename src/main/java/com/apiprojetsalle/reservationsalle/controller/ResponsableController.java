package com.apiprojetsalle.reservationsalle.controller;


import com.apiprojetsalle.reservationsalle.model.Responsable;
import com.apiprojetsalle.reservationsalle.service.ResponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ResponsableController {

    @Autowired
    public ResponsableService responsableService;

    @RequestMapping(value = "/responsables", method = RequestMethod.GET)
    public List<Responsable> getAllResponsables() {

        List<Responsable> responsables = new ArrayList<>();

        try {
            responsables = this.responsableService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return responsables;

    }

    @RequestMapping(value = "/responsable/{id}", method = RequestMethod.GET)
    public Responsable getOneResponsable(@PathVariable Long id) {

        Responsable responsable = new Responsable();

        try {
            responsable = this.responsableService.findById(id);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return responsable;
    }

    @RequestMapping(value = "/responsable/ajouter", method = RequestMethod.POST, headers = "accept=Application/json")
    public Responsable saveResponsable(@RequestBody Responsable responsable) {

        try {
            responsable = this.responsableService.save(responsable);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return responsable;
    }

    @RequestMapping(value = "/responsable/modifier/{id}", method = RequestMethod.PUT, headers = "accept=Application/json")
    public Responsable updateResponsable(@RequestBody Responsable responsable) {

        try {
            responsable = this.responsableService.update(responsable);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return responsable;

    }

    @RequestMapping(value = "/responsable/supprimer/{id}", method = RequestMethod.DELETE, headers = "accept=Application/json")
    public void deleteResponsable(@PathVariable Long id) {
        this.responsableService.deleteById(id);
    }
}
