package com.gcastellini.miportfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcastellini.miportfolio.models.ExperienciaLaboral;
import com.gcastellini.miportfolio.models.Tecnologias;
import com.gcastellini.miportfolio.repositories.TecRepository;

@Service
public class TecServiceImpl implements TecService {
	@Autowired
	private TecRepository repo;
	
	@Override
	public Tecnologias listarTec(long id) {
		return repo.findById(id);
	}
	@Override
	public Tecnologias add(Tecnologias t) {
		return repo.save(t);
	}
	@Override
	public Tecnologias editTec(Tecnologias t) {
		return repo.save(t);
	}
	@Override
	public Tecnologias deleteTec(long id) {
		Tecnologias t=repo.findById(id);
		if(t!=null) {
			repo.delete(t);
			}
		return t;
	}
}
