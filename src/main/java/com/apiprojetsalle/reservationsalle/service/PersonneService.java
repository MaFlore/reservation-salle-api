package com.apiprojetsalle.reservationsalle.service;

import com.apiprojetsalle.reservationsalle.model.Personne;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonneService {

    public List<Personne> getAll();

    public Personne findById(Long id);

    public Personne save(Personne personne);

    public Personne update(Personne personne);

    public void deleteById(Long id);
}
