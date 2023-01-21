package com.apiprojetsalle.reservationsalle.serviceImpl;

import com.apiprojetsalle.reservationsalle.model.SalleMateriel;
import com.apiprojetsalle.reservationsalle.repository.SalleMaterielRepository;
import com.apiprojetsalle.reservationsalle.service.SalleMaterielService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SalleMaterielServiceImpl implements SalleMaterielService {
    @Autowired
    public SalleMaterielRepository salleMaterielRepository;
    @Override
    public List<SalleMateriel> getAll() {
        return this.salleMaterielRepository.findAll();
    }

    @Override
    public SalleMateriel findById(Long id) {
        return this.salleMaterielRepository.findById(id).orElse(null);
    }

    @Override
    public SalleMateriel save(SalleMateriel salleMateriel) {
        return this.salleMaterielRepository.save(salleMateriel);
    }

    @Override
    public SalleMateriel update(SalleMateriel salleMateriel) {
        return this.salleMaterielRepository.save(salleMateriel);
    }

    @Override
    public void deleteById(Long id) {
        this.salleMaterielRepository.deleteById(id);
    }
}
