package com.apiprojetsalle.reservationsalle.service;

import com.apiprojetsalle.reservationsalle.model.Materiel;
import com.apiprojetsalle.reservationsalle.model.Salle;
import com.apiprojetsalle.reservationsalle.model.SalleMateriel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SalleMaterielService {

    public List<SalleMateriel> getAll();

    public SalleMateriel findById(Long id);

    public SalleMateriel save(SalleMateriel salleMateriel);

    public SalleMateriel update(SalleMateriel salleMateriel);

    public void deleteById(Long id);
}
