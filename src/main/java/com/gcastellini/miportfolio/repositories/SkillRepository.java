package com.gcastellini.miportfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcastellini.miportfolio.models.Persona;
import com.gcastellini.miportfolio.models.SoftSkills;

public interface SkillRepository extends JpaRepository <SoftSkills,Long>{
  List<SoftSkills> findAll(); 
  SoftSkills findById(long id);
  SoftSkills save(SoftSkills s);
  void delete(SoftSkills s);
}
