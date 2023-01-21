package com.apiprojetsalle.reservationsalle.service;

import com.apiprojetsalle.reservationsalle.model.Evenement;
import com.apiprojetsalle.reservationsalle.model.Participant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ParticipantService {

    public List<Participant> getAll();

    public Participant findById(Long id);

    public Participant save(Participant participant);

    public Participant update(Participant participant);

    public void deleteById(Long id);

}
