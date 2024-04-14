package com.yannick.gestionpresence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;

@Entity
public class Presence {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPresence;

    @ManyToOne
    @JoinColumn(name = "idEmploye")
    private Personnel personnel;

    @Setter
    @Getter
    private Date date;
    @Setter
    @Getter
    private String heureEntree;
    @Setter
    @Getter
    private String heureSortie;
    @Setter
    @Getter
    private boolean presenceConfirmee;

    @JoinColumn(name = "type_conge_id")
    private String typeConge;


    // Getters and setters
}
