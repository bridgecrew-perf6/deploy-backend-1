package com.gcastellini.miportfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcastellini.miportfolio.models.SoftSkills;
import com.gcastellini.miportfolio.models.Tecnologias;
import com.gcastellini.miportfolio.repositories.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {
	@Autowired
	private SkillRepository repo;
	
	@Override
	public SoftSkills listarSoft(long id) {
		return repo.findById(id);
	}
	@Override
	public SoftSkills add(SoftSkills s) {
		return repo.save(s);
	}
	@Override
	public SoftSkills editSoft(SoftSkills s) {
		return repo.save(s);
	}
	@Override
	public SoftSkills deleteSoft(long id) {
		SoftSkills s=repo.findById(id);
		if(s!=null) {
			repo.delete(s);
			}
		return s;
	}
}
