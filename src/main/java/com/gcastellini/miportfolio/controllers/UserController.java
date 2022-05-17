package com.gcastellini.miportfolio.controllers;

import com.gcastellini.miportfolio.repositories.EducRepository;
import com.gcastellini.miportfolio.repositories.ExpRepository;
import com.gcastellini.miportfolio.repositories.LangRepository;
import com.gcastellini.miportfolio.repositories.PersonaRepository;
import com.gcastellini.miportfolio.repositories.ProjRepository;
import com.gcastellini.miportfolio.repositories.SkillRepository;
import com.gcastellini.miportfolio.repositories.TecRepository;
import com.gcastellini.miportfolio.repositories.UserRepository;
import com.gcastellini.miportfolio.services.ExpService;
import com.gcastellini.miportfolio.services.PersService;
import com.gcastellini.miportfolio.services.TecService;
import com.gcastellini.miportfolio.models.ApplicationUser;
import com.gcastellini.miportfolio.models.Educacion;
import com.gcastellini.miportfolio.models.ExperienciaLaboral;
import com.gcastellini.miportfolio.models.Idiomas;
import com.gcastellini.miportfolio.models.Persona;
import com.gcastellini.miportfolio.models.Proyectos;
import com.gcastellini.miportfolio.models.SoftSkills;
import com.gcastellini.miportfolio.models.Tecnologias;

import org.apache.tomcat.jni.Status;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping
public class UserController {
	private UserRepository applicationUserRepository;
	private ExpRepository   expRepo;
	private EducRepository  eduRepo;
	private TecRepository tecRepo;
	private SkillRepository skillRepo;
	private LangRepository langRepo;
	private PersonaRepository persRepo;
	private ProjRepository projRepo;
	
	
	
    public UserController(UserRepository applicationUserRepository,ExpRepository expRepo,EducRepository eduRepo,TecRepository tecRepo, SkillRepository skillRepo, LangRepository langRepo, PersonaRepository persRepo, ProjRepository projRepo) {
    this.applicationUserRepository = applicationUserRepository;
    this.expRepo = expRepo;
    this.eduRepo = eduRepo;
    this.tecRepo = tecRepo;
    this.skillRepo= skillRepo;
    this.langRepo = langRepo;
    this.persRepo = persRepo;
    this.projRepo = projRepo;
    
    }
    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody ApplicationUser userData) {
   ApplicationUser user=applicationUserRepository.findByUsername(userData.getUsername());
    if (user == null) {	
    	userData.setPassword((userData.getPassword()));
        applicationUserRepository.save(userData);
        return ResponseEntity.ok(user);
    }
    else {
    	return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }
    }
    
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody ApplicationUser userData) {
    	ApplicationUser user=applicationUserRepository.findByUsername(userData.getUsername());
    	if(user.getPassword().equals(userData.getPassword()))
    		return ResponseEntity.ok(user);
    	return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }
    
    @GetMapping("/experiencias")
    public List<ExperienciaLaboral> exp(){
    	List<ExperienciaLaboral> experiencias = expRepo.findAll();
    	return experiencias;
    		
    }

  
   

    @GetMapping("/educacion")
    public List<Educacion> edu(){
    	List<Educacion> educacion = eduRepo.findAll();
    	return educacion;
    }
    @GetMapping("/tecnologias")
    public List<Tecnologias> tec(){
    	List<Tecnologias> tecnologias = tecRepo.findAll();
    	return tecnologias;
    }
    

    @GetMapping("/skills")
    public List<SoftSkills> soft(){
    	List<SoftSkills> softskills = skillRepo.findAll();
    	return softskills;
    }
    @GetMapping("/idiomas")
    public List<Idiomas> lang(){
    	List<Idiomas> idiomas = langRepo.findAll();
    	return idiomas;
    }
    @GetMapping("/personas")
    public List<Persona> people(){
    	List<Persona> persona = persRepo.findAll();
    	return persona;
    }
    
   

    @GetMapping("/proyectos")
    public List<Proyectos> proj(){
    	List<Proyectos> proyectos = projRepo.findAll();
    	return proyectos;
    }
    
    
}
