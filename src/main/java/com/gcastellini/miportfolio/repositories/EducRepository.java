package com.gcastellini.miportfolio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcastellini.miportfolio.models.Educacion;

public interface EducRepository extends JpaRepository<Educacion,Long>{
	List<Educacion>  findAll();
	Educacion  findById(long id);
	Educacion save(Educacion ed);
    void delete(Educacion ed);
	

}
