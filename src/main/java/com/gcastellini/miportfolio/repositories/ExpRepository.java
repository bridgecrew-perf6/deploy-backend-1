package com.gcastellini.miportfolio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcastellini.miportfolio.models.Educacion;
import com.gcastellini.miportfolio.models.ExperienciaLaboral;


public interface ExpRepository extends JpaRepository <ExperienciaLaboral,Long> {
  List<ExperienciaLaboral> findAll();
  ExperienciaLaboral findById (long id);
  ExperienciaLaboral save(ExperienciaLaboral ex);
  void delete(ExperienciaLaboral ex);
  
  
}
