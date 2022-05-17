package com.gcastellini.miportfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcastellini.miportfolio.models.Educacion;
import com.gcastellini.miportfolio.models.Idiomas;

public interface LangRepository extends JpaRepository<Idiomas,Long>{
 List<Idiomas> findAll();
 Idiomas findById(long id);
 Idiomas save(Idiomas i);
 void delete(Idiomas i);
}
