package com.apiprojetsalle.reservationsalle.serviceImpl;

import com.apiprojetsalle.reservationsalle.model.Categorie;
import com.apiprojetsalle.reservationsalle.repository.CategorieRepository;
import com.apiprojetsalle.reservationsalle.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategorieServiceImpl implements CategorieService {

    @Autowired
    public CategorieRepository categorieRepository;

    @Override
    public List<Categorie> getAll() {
        return this.categorieRepository.findAll();
    }

    @Override
    public Categorie findById(Long id) {
        return this.categorieRepository.findById(id).orElse(null);
    }

    @Override
    public Categorie save(Categorie categorie) {
        return this.categorieRepository.save(categorie);
    }

    @Override
    public Categorie update(Categorie categorie) {
        return this.categorieRepository.save(categorie);
    }

    @Override
    public void deleteById(Long id) {
        this.categorieRepository.deleteById(id);
    }
}
