package com.apiprojetsalle.reservationsalle.service;

import com.apiprojetsalle.reservationsalle.model.Reservation;
import com.apiprojetsalle.reservationsalle.model.ReservationSalle;
import com.apiprojetsalle.reservationsalle.model.Salle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationSalleService {

    public List<ReservationSalle> getAll();

    public ReservationSalle findById(Long id);

    public ReservationSalle save(ReservationSalle reservationSalle);

    public ReservationSalle update(ReservationSalle reservationSalle);

    public void deleteById(Long id);

}
