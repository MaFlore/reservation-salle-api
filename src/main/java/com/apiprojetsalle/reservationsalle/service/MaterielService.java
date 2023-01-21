package com.apiprojetsalle.reservationsalle.service;

import com.apiprojetsalle.reservationsalle.model.Categorie;
import com.apiprojetsalle.reservationsalle.model.Materiel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MaterielService {

    public List<Materiel> getAll();

    public Materiel findById(Long id);

    public Materiel save(Materiel materiel);

    public Materiel update(Materiel materiel);

    public void deleteById(Long id);
}
