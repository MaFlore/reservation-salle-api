package com.apiprojetsalle.reservationsalle.serviceImpl;

import com.apiprojetsalle.reservationsalle.model.Evenement;
import com.apiprojetsalle.reservationsalle.repository.EvenementRepository;
import com.apiprojetsalle.reservationsalle.service.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EvenementServiceImpl implements EvenementService {

    @Autowired
    public EvenementRepository evenementRepository;

    @Override
    public List<Evenement> getAll() {
        return this.evenementRepository.findAll();
    }

    @Override
    public Evenement findById(Long id) {
        return this.evenementRepository.findById(id).orElse(null);
    }

    @Override
    public Evenement save(Evenement evenement) {
        return this.evenementRepository.save(evenement);
    }

    @Override
    public Evenement update(Evenement evenement) {
        return this.evenementRepository.save(evenement);
    }

    @Override
    public void deleteById(Long id) {
        this.evenementRepository.deleteById(id);
    }
}
