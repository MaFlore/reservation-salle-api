package com.apiprojetsalle.reservationsalle.serviceImpl;

import com.apiprojetsalle.reservationsalle.model.Personne;
import com.apiprojetsalle.reservationsalle.repository.PersonneRepository;
import com.apiprojetsalle.reservationsalle.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonneServiceImpl implements PersonneService {

    @Autowired
    public PersonneRepository personneRepository;

    @Override
    public List<Personne> getAll() {
        return this.personneRepository.findAll();
    }

    @Override
    public Personne findById(Long id) {
        return this.personneRepository.findById(id).orElse(null);
    }

    @Override
    public Personne save(Personne personne) {
        return this.personneRepository.save(personne);
    }

    @Override
    public Personne update(Personne personne) {
        return this.personneRepository.save(personne);
    }

    @Override
    public void deleteById(Long id) {
        this.personneRepository.deleteById(id);
    }
}
