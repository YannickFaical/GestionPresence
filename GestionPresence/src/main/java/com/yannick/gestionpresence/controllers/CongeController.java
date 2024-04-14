package com.yannick.gestionpresence.controllers;

import com.yannick.gestionpresence.entities.Conge;
import com.yannick.gestionpresence.service.CongeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conges")
public class CongeController {
    @Autowired
    private CongeService congeService;

    @GetMapping
    public List<Conge> getAllConges() {
        return congeService.getAllConges();
    }

    @GetMapping("/{id}")
    public Conge getCongeById(@PathVariable int id) {
        return congeService.getCongeById(id);
    }

    @PostMapping
    public Conge addConge(@RequestBody Conge conge) {
        return congeService.saveConge(conge);
    }

    @DeleteMapping("/{id}")
    public void deleteConge(@PathVariable int id) {
        congeService.deleteConge(id);
    }
}
