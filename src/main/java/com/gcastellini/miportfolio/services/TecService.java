package com.gcastellini.miportfolio.services;

import com.gcastellini.miportfolio.models.ExperienciaLaboral;
import com.gcastellini.miportfolio.models.Tecnologias;

public interface TecService {
	Tecnologias listarTec(long id);
	Tecnologias add(Tecnologias t);
	Tecnologias editTec(Tecnologias t);
	Tecnologias deleteTec(long id);

}
