package com.apiprojetsalle.reservationsalle.service;

import com.apiprojetsalle.reservationsalle.model.Responsable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ResponsableService {

    public List<Responsable> getAll();

    public Responsable findById(Long id);

    public Responsable save(Responsable responsable);

    public Responsable update(Responsable responsable);

    public void deleteById(Long id);
}
