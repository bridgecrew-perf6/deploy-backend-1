package com.gcastellini.miportfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcastellini.miportfolio.models.Persona;
import com.gcastellini.miportfolio.models.Tecnologias;
import com.gcastellini.miportfolio.repositories.PersonaRepository;
import com.gcastellini.miportfolio.repositories.TecRepository;

@Service
public class PersServiceImpl implements PersService{
	@Autowired
	private PersonaRepository repo;
	
	@Override
	public Persona listarP(long id) {
		return repo.findById(id);
	}
	@Override
	public Persona add(Persona p) {
		return repo.save(p);
	}
	@Override
	public Persona editP(Persona p) {
		return repo.save(p);
	}
	@Override
	public Persona deleteP(long id) {
		Persona p=repo.findById(id);
		if(p!=null) {
			repo.delete(p);
			}
		return p;
	}
}
