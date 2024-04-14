package com.yannick.gestionpresence.entities;

import jakarta.persistence.OneToMany;

import java.util.List;

public class GestionnaireDonnees {
    @OneToMany(mappedBy = "employe")
    private List<Presence> presences;

    @OneToMany(mappedBy = "employe")
    private List<Conge> conges;

    @OneToMany(mappedBy = "employe")
    private List<Retard> retards;

    public List<Presence> getPresences() {
        return presences;
    }

    public void setPresences(List<Presence> presences) {
        this.presences = presences;
    }

    public List<Conge> getConges() {
        return conges;
    }

    public void setConges(List<Conge> conges) {
        this.conges = conges;
    }

    public List<Retard> getRetards() {
        return retards;
    }

    public void setRetards(List<Retard> retards) {
        this.retards = retards;
    }
// Getters and setters
}
