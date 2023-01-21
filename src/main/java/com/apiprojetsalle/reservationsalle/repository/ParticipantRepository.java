package com.apiprojetsalle.reservationsalle.repository;

import com.apiprojetsalle.reservationsalle.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
