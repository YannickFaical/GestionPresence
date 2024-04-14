package com.yannick.gestionpresence.entities;

import jakarta.persistence.*;


import java.util.Date;

@Entity
public class Conge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConge;

    @ManyToOne
    @JoinColumn(name = "idPersonnel")
    private Personnel personnel;

    private Date dateDebut;
    private Date dateFin;
    private String motif;
    private boolean statutValidation;

    public int getIdConge() {
        return idConge;
    }

    public void setIdConge(int idConge) {
        this.idConge = idConge;
    }

    public Personnel getEmploye() {
        return personnel;
    }

    public void setEmploye(Personnel personnel) {
        this.personnel = personnel;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public boolean isStatutValidation() {
        return statutValidation;
    }

    public void setStatutValidation(boolean statutValidation) {
        this.statutValidation = statutValidation;
    }
// Getters and setters

}

