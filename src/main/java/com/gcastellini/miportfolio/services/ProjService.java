package com.gcastellini.miportfolio.services;

import com.gcastellini.miportfolio.models.Proyectos;

public interface ProjService {
	Proyectos listarId(long id);
	Proyectos add(Proyectos pr);
	Proyectos edit(Proyectos pr);
	Proyectos delete(long id);
}
