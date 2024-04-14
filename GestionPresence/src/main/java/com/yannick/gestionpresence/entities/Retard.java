package com.yannick.gestionpresence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Retard {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRetard;

    @ManyToOne
    @JoinColumn(name = "idEmploye")
    private Personnel personnel;

    private Date date;
    private LocalDate heurePrevue;
    private LocalDate heureReelle;



// Getters and setters
}
