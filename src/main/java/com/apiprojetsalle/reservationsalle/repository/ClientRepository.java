package com.apiprojetsalle.reservationsalle.repository;

import com.apiprojetsalle.reservationsalle.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
