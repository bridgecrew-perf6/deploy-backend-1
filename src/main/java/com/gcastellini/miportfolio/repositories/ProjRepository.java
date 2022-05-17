package com.gcastellini.miportfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcastellini.miportfolio.models.Persona;
import com.gcastellini.miportfolio.models.Proyectos;

public interface ProjRepository extends JpaRepository<Proyectos,Long>{
 List<Proyectos> findAll();
 Proyectos findById(long id);
 Proyectos save(Proyectos pr);
 void delete(Proyectos pr);
}
