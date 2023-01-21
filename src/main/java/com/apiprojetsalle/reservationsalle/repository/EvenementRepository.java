package com.apiprojetsalle.reservationsalle.repository;

import com.apiprojetsalle.reservationsalle.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {
}
