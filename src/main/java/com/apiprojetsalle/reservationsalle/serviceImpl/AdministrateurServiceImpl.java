package com.apiprojetsalle.reservationsalle.serviceImpl;

import com.apiprojetsalle.reservationsalle.model.Administrateur;
import com.apiprojetsalle.reservationsalle.repository.AdministrateurRepository;
import com.apiprojetsalle.reservationsalle.service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdministrateurServiceImpl implements AdministrateurService {

    @Autowired
    public AdministrateurRepository administrateurRepository;

    @Override
    public List<Administrateur> getAll() {
        return this.administrateurRepository.findAll();
    }

    @Override
    public Administrateur findById(Long id) {
        return this.administrateurRepository.findById(id).orElse(null);
    }

    @Override
    public Administrateur save(Administrateur administrateur) {
        return this.administrateurRepository.save(administrateur);
    }

    @Override
    public Administrateur update(Administrateur administrateur) {
        return this.administrateurRepository.save(administrateur);
    }

    @Override
    public void deleteById(Long id) {
        this.administrateurRepository.deleteById(id);
    }
}
