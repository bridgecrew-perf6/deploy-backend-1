package com.gcastellini.miportfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcastellini.miportfolio.models.ExperienciaLaboral;
import com.gcastellini.miportfolio.repositories.ExpRepository;

@Service
public class ExpServiceImpl implements ExpService{
	@Autowired
	private ExpRepository repo;
	
	@Override
	public ExperienciaLaboral listarId(long id) {
		return repo.findById(id);
	}
	@Override
	public ExperienciaLaboral add(ExperienciaLaboral ex) {
		return repo.save(ex);
	}
	@Override
	public ExperienciaLaboral edit(ExperienciaLaboral ex) {
		return repo.save(ex);
	}
	@Override
	public ExperienciaLaboral delete(long id) {
		ExperienciaLaboral ex=repo.findById(id);
		if(ex!=null) {
			repo.delete(ex);
			}
		return ex;
	}

}
