package com.gcastellini.miportfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcastellini.miportfolio.models.Idiomas;
import com.gcastellini.miportfolio.repositories.LangRepository;

@Service
public class LangServiceImpl implements LangService {
	@Autowired
	private LangRepository repo;
	
	@Override
	public Idiomas listarLang(long id) {
		return repo.findById(id);
	}
	@Override
	public Idiomas addLang(Idiomas i) {
		return repo.save(i);
	}
	@Override
	public Idiomas editLang(Idiomas i) {
		return repo.save(i);
	}
	@Override
	public Idiomas deleteLang(long id) {
		Idiomas i=repo.findById(id);
		if(i!=null) {
			repo.delete(i);
			}
		return i;
	}

}
