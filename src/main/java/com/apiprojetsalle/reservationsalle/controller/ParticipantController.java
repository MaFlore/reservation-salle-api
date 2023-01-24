package com.apiprojetsalle.reservationsalle.controller;

import com.apiprojetsalle.reservationsalle.model.Participant;
import com.apiprojetsalle.reservationsalle.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ParticipantController {

    @Autowired
    public ParticipantService participantService;

    @RequestMapping(value = "/participants", method = RequestMethod.GET)
    public List<Participant> getAllParticipants() {

        List<Participant> participants = new ArrayList<>();

        try {
            participants = this.participantService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return participants;

    }

    @RequestMapping(value = "/participant/{id}", method = RequestMethod.GET)
    public Participant getOneParticipant(@PathVariable Long id) {

        Participant participant = new Participant();

        try {
            participant = this.participantService.findById(id);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return participant;
    }

    @RequestMapping(value = "/participant/ajouter", method = RequestMethod.POST, headers = "accept=Application/json")
    public Participant saveParticipant(@RequestBody Participant participant) {

        try {
            participant = this.participantService.save(participant);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return participant;
    }

    @RequestMapping(value = "/participant/modifier/{id}", method = RequestMethod.PUT, headers = "accept=Application/json")
    public Participant updateParticipant(@RequestBody Participant participant) {

        try {
            participant = this.participantService.update(participant);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return participant;

    }

    @RequestMapping(value = "/participant/supprimer/{id}", method = RequestMethod.DELETE, headers = "accept=Application/json")
    public void deleteParticipant(@PathVariable Long id) {
        this.participantService.deleteById(id);
    }
}
