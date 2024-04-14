package com.yannick.gestionpresence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Personnel {
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonnel;


    @Setter
    @Getter
    private String nom;
    @Setter
    @Getter
    private String prenom;
    @Setter
    @Getter
    private String email;

    @Setter
    @Getter
    private String password;

    @Setter
    @Getter
    @Column(name = "poste")
    private String poste;

    private String photo;

    private boolean estPermenant;

    @OneToMany(mappedBy = "personnel")
    private List<Presence> presences;

    @OneToMany(mappedBy = "personnel")
    private List<Conge> conges;

    @OneToMany(mappedBy = "personnel")
    private List<Retard> retards;


}
