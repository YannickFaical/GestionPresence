package com.yannick.gestionpresence.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Etage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "etages")
    private Set<GestionPresence> gestionPresences = new HashSet<>();

    @Column(name ="descriptionEtage")
    private String descriptionEtage;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<GestionPresence> getGestionPresences() {
        return gestionPresences;
    }

    public void setGestionPresences(Set<GestionPresence> gestionPresences) {
        this.gestionPresences = gestionPresences;
    }
}
