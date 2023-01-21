package com.apiprojetsalle.reservationsalle.service;

import com.apiprojetsalle.reservationsalle.model.Client;
import com.apiprojetsalle.reservationsalle.model.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationService {

    public List<Reservation> getAll();

    public Reservation findById(Long id);

    public Reservation save(Reservation reservation);

    public Reservation update(Reservation reservation);

    public void deleteById(Long id);

}
