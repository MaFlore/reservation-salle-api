package com.apiprojetsalle.reservationsalle.serviceImpl;

import com.apiprojetsalle.reservationsalle.model.Categorie;
import com.apiprojetsalle.reservationsalle.model.Materiel;
import com.apiprojetsalle.reservationsalle.repository.MaterielRepository;
import com.apiprojetsalle.reservationsalle.service.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MaterielServiceImpl implements MaterielService {
    @Autowired
    public MaterielRepository materielRepository;

    @Override
    public List<Materiel> getAll() {
        return this.materielRepository.findAll();
    }

    @Override
    public Materiel findById(Long id) {
        return this.materielRepository.findById(id).orElse(null);
    }

    @Override
    public Materiel save(Materiel materiel) {
        return this.materielRepository.save(materiel);
    }

    @Override
    public Materiel update(Materiel materiel) {
        return this.materielRepository.save(materiel);
    }

    @Override
    public void deleteById(Long id) {
        this.materielRepository.deleteById(id);
    }
}
