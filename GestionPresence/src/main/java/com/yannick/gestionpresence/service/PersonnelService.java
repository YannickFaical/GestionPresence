package com.yannick.gestionpresence.service;


import com.yannick.gestionpresence.entities.Personnel;
import com.yannick.gestionpresence.repositories.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelService {
    @Autowired
    private PersonnelRepository personnelRepository;

    public List<Personnel> getAllPersonnel() {
        return personnelRepository.findAll();
    }

    public Personnel getPersonnelById(int id) {
        return personnelRepository.findById(id).orElse(null);
    }

    public Personnel savePersonnel(Personnel personnel) {
        return personnelRepository.save(personnel);
    }

    public void deletePersonnel(int id) {
        personnelRepository.deleteById(id);
    }
}
