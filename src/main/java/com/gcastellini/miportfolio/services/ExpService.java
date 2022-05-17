package com.gcastellini.miportfolio.services;

import java.util.List;

import com.gcastellini.miportfolio.models.ExperienciaLaboral;

public interface ExpService {
	ExperienciaLaboral listarId(long id);
	ExperienciaLaboral add(ExperienciaLaboral ex);
	ExperienciaLaboral edit(ExperienciaLaboral ex);
	ExperienciaLaboral delete(long id);
	

}
