package com.apiprojetsalle.reservationsalle.service;

import com.apiprojetsalle.reservationsalle.model.Responsable;
import com.apiprojetsalle.reservationsalle.model.Salle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SalleService {

    public List<Salle> getAll();

    public Salle findById(Long id);

    public Salle save(Salle salle);

    public Salle update(Salle salle);

    public void deleteById(Long id);

}
