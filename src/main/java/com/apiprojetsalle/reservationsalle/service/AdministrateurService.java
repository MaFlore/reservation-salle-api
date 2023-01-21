package com.apiprojetsalle.reservationsalle.service;

import com.apiprojetsalle.reservationsalle.model.Administrateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdministrateurService {

    public List<Administrateur> getAll();

    public Administrateur findById(Long id);

    public Administrateur save(Administrateur administrateur);

    public Administrateur update(Administrateur administrateur);

    public void deleteById(Long id);
}
