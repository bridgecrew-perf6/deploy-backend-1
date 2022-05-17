package com.gcastellini.miportfolio.services;

import com.gcastellini.miportfolio.models.Persona;
import com.gcastellini.miportfolio.models.Tecnologias;

public interface PersService {
	Persona listarP(long id);
	Persona add(Persona p);
	Persona editP(Persona p);
	Persona deleteP(long id);
}
