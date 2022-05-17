package com.gcastellini.miportfolio.services;

import com.gcastellini.miportfolio.models.SoftSkills;

public interface SkillService {
	SoftSkills listarSoft(long id);
	SoftSkills add(SoftSkills s);
	SoftSkills editSoft(SoftSkills s);
	SoftSkills deleteSoft(long id);

}
