package com.gcastellini.miportfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcastellini.miportfolio.models.Proyectos;
import com.gcastellini.miportfolio.repositories.ProjRepository;

@Service
public class ProjServiceImpl implements ProjService {
	@Autowired
	private ProjRepository repo;
	
	@Override
	public Proyectos listarId(long id) {
		return repo.findById(id);
	}
	@Override
	public Proyectos add(Proyectos pr) {
		return repo.save(pr);
	}
	@Override
	public Proyectos edit(Proyectos pr) {
		return repo.save(pr);
	}
	@Override
	public Proyectos delete(long id) {
		Proyectos pr=repo.findById(id);
		if(pr!=null) {
			repo.delete(pr);
			}
		return pr;
	}
}
