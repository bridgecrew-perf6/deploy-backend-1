package com.gcastellini.miportfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcastellini.miportfolio.models.Educacion;
import com.gcastellini.miportfolio.models.Persona;

public interface PersonaRepository extends JpaRepository <Persona,Long>{
  List<Persona> findAll();
  Persona findById(long id);
  Persona save(Persona p);
  void delete(Persona p);
}
