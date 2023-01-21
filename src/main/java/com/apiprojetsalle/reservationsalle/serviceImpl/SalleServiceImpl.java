package com.apiprojetsalle.reservationsalle.serviceImpl;

import com.apiprojetsalle.reservationsalle.model.Salle;
import com.apiprojetsalle.reservationsalle.repository.SalleRepository;
import com.apiprojetsalle.reservationsalle.service.SalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalleServiceImpl implements SalleService {
    @Autowired
    public SalleRepository salleRepository;
    @Override
    public List<Salle> getAll() {
        return this.salleRepository.findAll();
    }

    @Override
    public Salle findById(Long id) {
        return this.salleRepository.findById(id).orElse(null);
    }

    @Override
    public Salle save(Salle salle) {
        return this.salleRepository.save(salle);
    }

    @Override
    public Salle update(Salle salle) {
        return this.salleRepository.save(salle);
    }

    @Override
    public void deleteById(Long id) {
        this.salleRepository.deleteById(id);
    }
}
