package com.apiprojetsalle.reservationsalle.repository;

import com.apiprojetsalle.reservationsalle.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
