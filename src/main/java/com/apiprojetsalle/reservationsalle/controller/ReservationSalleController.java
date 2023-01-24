package com.apiprojetsalle.reservationsalle.controller;

import com.apiprojetsalle.reservationsalle.model.ReservationSalle;
import com.apiprojetsalle.reservationsalle.service.ReservationSalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ReservationSalleController {

    @Autowired
    public ReservationSalleService reservationSalleService;

    @RequestMapping(value = "/reservations_salles", method = RequestMethod.GET)
    public List<ReservationSalle> getAllReservationSalles() {

        List<ReservationSalle> reservationSalles = new ArrayList<>();

        try {
            reservationSalles = this.reservationSalleService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return reservationSalles;

    }

    @RequestMapping(value = "/reservation_salle/{id}", method = RequestMethod.GET)
    public ReservationSalle getOneReservationSalle(@PathVariable Long id) {

        ReservationSalle reservationSalle = new ReservationSalle();

        try {
            reservationSalle = this.reservationSalleService.findById(id);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return reservationSalle;
    }

    @RequestMapping(value = "/reservation_salle/ajouter", method = RequestMethod.POST, headers = "accept=Application/json")
    public ReservationSalle saveReservationSalle(@RequestBody ReservationSalle reservationSalle) {

        try {
            reservationSalle = this.reservationSalleService.save(reservationSalle);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return reservationSalle;
    }

    @RequestMapping(value = "/reservation_salle/modifier/{id}", method = RequestMethod.PUT, headers = "accept=Application/json")
    public ReservationSalle updateReservationSalle(@RequestBody ReservationSalle reservationSalle) {

        try {
            reservationSalle = this.reservationSalleService.update(reservationSalle);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }

        return reservationSalle;

    }

    @RequestMapping(value = "/reservation_salle/supprimer/{id}", method = RequestMethod.DELETE, headers = "accept=Application/json")
    public void deleteReservationSalle(@PathVariable Long id) {
        this.reservationSalleService.deleteById(id);
    }
}
