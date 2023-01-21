package com.apiprojetsalle.reservationsalle.service;

import com.apiprojetsalle.reservationsalle.model.Evenement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EvenementService {

    public List<Evenement> getAll();

    public Evenement findById(Long id);

    public Evenement save(Evenement evenement);

    public Evenement update(Evenement evenement);

    public void deleteById(Long id);
}
