package com.yannick.gestionpresence.repositories;

import com.yannick.gestionpresence.entities.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnelRepository extends JpaRepository<Personnel, Integer> {

}
