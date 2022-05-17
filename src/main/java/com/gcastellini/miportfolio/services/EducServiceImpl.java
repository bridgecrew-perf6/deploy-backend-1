package com.gcastellini.miportfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcastellini.miportfolio.models.Educacion;
import com.gcastellini.miportfolio.models.Persona;
import com.gcastellini.miportfolio.repositories.EducRepository;
import com.gcastellini.miportfolio.repositories.PersonaRepository;

@Service
public class EducServiceImpl implements EducService{
	@Autowired
	private EducRepository repo;
	
	@Override
	public Educacion listarId(long id) {
		return repo.findById(id);
	}
	@Override
	public Educacion add(Educacion ed) {
		return repo.save(ed);
	}
	@Override
	public Educacion editEd(Educacion ed) {
		return repo.save(ed);
	}
	@Override
	public Educacion deleteEd(long id) {
		Educacion ed=repo.findById(id);
		if(ed!=null) {
			repo.delete(ed);
			}
		return ed;
	}
}
