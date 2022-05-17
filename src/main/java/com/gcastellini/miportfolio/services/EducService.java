package com.gcastellini.miportfolio.services;

import com.gcastellini.miportfolio.models.Educacion;

public interface EducService {
	Educacion listarId(long id);
	Educacion add(Educacion ed);
	Educacion editEd(Educacion ed);
	Educacion deleteEd(long id);
}
