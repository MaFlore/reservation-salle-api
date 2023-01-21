package com.apiprojetsalle.reservationsalle.service;

import com.apiprojetsalle.reservationsalle.model.Categorie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategorieService {

    public List<Categorie> getAll();

    public Categorie findById(Long id);

    public Categorie save(Categorie categorie);

    public Categorie update(Categorie categorie);

    public void deleteById(Long id);
}
