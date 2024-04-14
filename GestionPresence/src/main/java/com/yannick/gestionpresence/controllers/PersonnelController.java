package com.yannick.gestionpresence.controllers;

import com.yannick.gestionpresence.entities.Personnel;
import com.yannick.gestionpresence.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personnel")
public class PersonnelController {

    @Autowired
    private PersonnelService personnelService;

    @GetMapping
    public List<Personnel> getAllPersonnel() {
        return personnelService.getAllPersonnel();
    }

    @GetMapping("/{id}")
    public Personnel getPersonnelById(@PathVariable int id) {
        return personnelService.getPersonnelById(id);
    }

    @PostMapping("/add")
    public Personnel addEPersonnel(@RequestBody Personnel personnel) {
        return personnelService.savePersonnel(personnel);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePersonnel(@PathVariable int id) {
        personnelService.deletePersonnel(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Personnel> updatePersonnel(@PathVariable int id, @RequestBody Personnel personnelDetails) {
        Personnel existingPersonnel = personnelService.getPersonnelById(id);
        if (existingPersonnel == null) {
            return ResponseEntity.notFound().build();
        }
        existingPersonnel.setNom(personnelDetails.getNom());
        existingPersonnel.setPrenom(personnelDetails.getPrenom());
        existingPersonnel.setEmail(personnelDetails.getEmail());
        Personnel updatedPersonnel = personnelService.savePersonnel(existingPersonnel);
        return ResponseEntity.ok(updatedPersonnel);
    }
}
