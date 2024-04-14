package com.yannick.gestionpresence.service;

import com.yannick.gestionpresence.entities.Conge;
import com.yannick.gestionpresence.repositories.CongeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CongeService {
    @Autowired
    private CongeRepository congeRepository;

    public List<Conge> getAllConges() {
        return congeRepository.findAll();
    }

    public Conge getCongeById(int id) {
        return congeRepository.findById(id).orElse(null);
    }

    public Conge saveConge(Conge conge) {
        return congeRepository.save(conge);
    }

    public void deleteConge(int id) {
        congeRepository.deleteById(id);
    }

}
