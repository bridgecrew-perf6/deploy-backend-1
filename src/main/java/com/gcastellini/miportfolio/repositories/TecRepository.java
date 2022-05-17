package com.gcastellini.miportfolio.repositories;

import com.gcastellini.miportfolio.models.Persona;
import com.gcastellini.miportfolio.models.Tecnologias;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TecRepository extends JpaRepository <Tecnologias,Long>{
	List<Tecnologias> findAll();
	 Tecnologias findById(long id);
	  Tecnologias save(Tecnologias t);
	  void delete(Tecnologias t);
}
