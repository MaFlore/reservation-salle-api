package com.apiprojetsalle.reservationsalle.service;

import com.apiprojetsalle.reservationsalle.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {

    public List<Client> getAll();

    public Client findById(Long id);

    public Client save(Client client);

    public Client update(Client client);

    public void deleteById(Long id);
}
