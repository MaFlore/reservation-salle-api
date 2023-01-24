package com.apiprojetsalle.reservationsalle.controller;

import com.apiprojetsalle.reservationsalle.model.Reservation;
import com.apiprojetsalle.reservationsalle.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ReservationController {

    @Autowired
    public ReservationService reservationService;

    @RequestMapping(value = "/reservations", method = RequestMethod.GET)
    public List<Reservation> getAllReservations() {

        List<Reservation> reservations = new ArrayList<>();

        try {
            reservations = this.reservationService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return reservations;

    }

    @RequestMapping(value = "/reservation/{id}", method = RequestMethod.GET)
    public Reservation getOneReservation(@PathVariable Long id) {

        Reservation reservation = new Reservation();

        try {
            reservation = this.reservationService.findById(id);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return reservation;
    }

    @RequestMapping(value = "/reservation/ajouter", method = RequestMethod.POST, headers = "accept=Application/json")
    public Reservation saveReservation(@RequestBody Reservation reservation) {

        try {
            reservation = this.reservationService.save(reservation);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return reservation;
    }

    @RequestMapping(value = "/reservation/modifier/{id}", method = RequestMethod.PUT, headers = "accept=Application/json")
    public Reservation updateReservation(@RequestBody Reservation reservation) {

        try {
            reservation = this.reservationService.update(reservation);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return reservation;

    }

    @RequestMapping(value = "/reservation/supprimer/{id}", method = RequestMethod.DELETE, headers = "accept=Application/json")
    public void deleteReservation(@PathVariable Long id) {
        this.reservationService.deleteById(id);
    }
}
