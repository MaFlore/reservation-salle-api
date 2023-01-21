package com.apiprojetsalle.reservationsalle.serviceImpl;

import com.apiprojetsalle.reservationsalle.model.Participant;
import com.apiprojetsalle.reservationsalle.repository.ParticipantRepository;
import com.apiprojetsalle.reservationsalle.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ParticipantServiceImpl implements ParticipantService {
    @Autowired
    public ParticipantRepository participantRepository;
    @Override
    public List<Participant> getAll() {
        return this.participantRepository.findAll();
    }

    @Override
    public Participant findById(Long id) {
        return this.participantRepository.findById(id).orElse(null);
    }

    @Override
    public Participant save(Participant participant) {
        return this.participantRepository.save(participant);
    }

    @Override
    public Participant update(Participant participant) {
        return this.participantRepository.save(participant);
    }

    @Override
    public void deleteById(Long id) {
        this.participantRepository.deleteById(id);
    }
}
