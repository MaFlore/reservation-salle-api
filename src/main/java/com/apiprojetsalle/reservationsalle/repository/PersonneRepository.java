package com.apiprojetsalle.reservationsalle.repository;

import com.apiprojetsalle.reservationsalle.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
}
