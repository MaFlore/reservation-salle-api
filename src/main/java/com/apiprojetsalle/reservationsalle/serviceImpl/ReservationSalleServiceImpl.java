package com.apiprojetsalle.reservationsalle.serviceImpl;

import com.apiprojetsalle.reservationsalle.model.ReservationSalle;
import com.apiprojetsalle.reservationsalle.repository.ReservationSalleRepository;
import com.apiprojetsalle.reservationsalle.service.ReservationSalleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReservationSalleServiceImpl implements ReservationSalleService {
    @Autowired
    public ReservationSalleRepository reservationSalleRepository;
    @Override
    public List<ReservationSalle> getAll() {
        return this.reservationSalleRepository.findAll();
    }

    @Override
    public ReservationSalle findById(Long id) {
        return this.reservationSalleRepository.findById(id).orElse(null);
    }

    @Override
    public ReservationSalle save(ReservationSalle reservationSalle) {
        return this.reservationSalleRepository.save(reservationSalle);
    }

    @Override
    public ReservationSalle update(ReservationSalle reservationSalle) {
        return this.reservationSalleRepository.save(reservationSalle);
    }

    @Override
    public void deleteById(Long id) {
        this.reservationSalleRepository.deleteById(id);
    }
}
