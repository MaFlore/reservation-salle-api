package com.apiprojetsalle.reservationsalle.serviceImpl;

import com.apiprojetsalle.reservationsalle.model.Reservation;
import com.apiprojetsalle.reservationsalle.repository.ReservationRepository;
import com.apiprojetsalle.reservationsalle.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReservationServiceImpl implements ReservationService {
    @Autowired
    public ReservationRepository reservationRepository;
    @Override
    public List<Reservation> getAll() {
        return this.reservationRepository.findAll();
    }

    @Override
    public Reservation findById(Long id) {
        return this.reservationRepository.findById(id).orElse(null);
    }

    @Override
    public Reservation save(Reservation reservation) {
        return this.reservationRepository.save(reservation);
    }

    @Override
    public Reservation update(Reservation reservation) {
        return this.reservationRepository.save(reservation);
    }

    @Override
    public void deleteById(Long id) {
        this.reservationRepository.deleteById(id);
    }
}
