package com.apiprojetsalle.reservationsalle.serviceImpl;

import com.apiprojetsalle.reservationsalle.model.Responsable;
import com.apiprojetsalle.reservationsalle.repository.ResponsableRepository;
import com.apiprojetsalle.reservationsalle.service.ResponsableService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ResponsableServiceImpl implements ResponsableService {
    @Autowired
    public ResponsableRepository responsableRepository;
    @Override
    public List<Responsable> getAll() {
        return this.responsableRepository.findAll();
    }

    @Override
    public Responsable findById(Long id) {
        return this.responsableRepository.findById(id).orElse(null);
    }

    @Override
    public Responsable save(Responsable responsable) {
        return this.responsableRepository.save(responsable);
    }

    @Override
    public Responsable update(Responsable responsable) {
        return this.responsableRepository.save(responsable);
    }

    @Override
    public void deleteById(Long id) {
        this.responsableRepository.deleteById(id);
    }
}
