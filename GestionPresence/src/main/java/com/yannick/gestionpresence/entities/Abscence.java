package com.yannick.gestionpresence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.Instant;

@Entity(name = "abscence")
public class Abscence {
    @Id
    private  int id_abscence;
    private Instant date_debut;
    private Instant date_fin;

    private boolean justifiee;


    private Personne personne;
}
