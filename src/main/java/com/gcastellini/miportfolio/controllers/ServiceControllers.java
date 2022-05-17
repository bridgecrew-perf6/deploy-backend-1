package com.gcastellini.miportfolio.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcastellini.miportfolio.models.Educacion;
import com.gcastellini.miportfolio.models.ExperienciaLaboral;
import com.gcastellini.miportfolio.models.Idiomas;
import com.gcastellini.miportfolio.models.Persona;
import com.gcastellini.miportfolio.models.Proyectos;
import com.gcastellini.miportfolio.models.SoftSkills;
import com.gcastellini.miportfolio.models.Tecnologias;
import com.gcastellini.miportfolio.services.EducService;
import com.gcastellini.miportfolio.services.ExpService;
import com.gcastellini.miportfolio.services.LangService;
import com.gcastellini.miportfolio.services.PersService;
import com.gcastellini.miportfolio.services.ProjService;
import com.gcastellini.miportfolio.services.SkillService;
import com.gcastellini.miportfolio.services.TecService;

@RestController
@RequestMapping
public class ServiceControllers {
	private ExpService expservice;
	private TecService tecservice;
	private PersService persservice;
	private SkillService skillservice;
	private LangService  langservice;
	private EducService  educservice;
	private ProjService  projservice;
	
	public ServiceControllers (ExpService expservice,TecService tecservice,PersService persservice, SkillService skillservice, LangService langservice, EducService educservice, ProjService projservice) {
		this.expservice = expservice;
		this.educservice = educservice;
	    this.tecservice = tecservice;
	    this.persservice = persservice;
	    this.skillservice= skillservice;
	    this.langservice=langservice;
	    this.projservice = projservice;
	}
    @GetMapping("/experiencias/{id}")
	public ExperienciaLaboral listarId(@PathVariable("id") long id) {
	return (ExperienciaLaboral) expservice.listarId(id);
}

    @PutMapping("/experiencias/{id}")
	 public ExperienciaLaboral editar(@RequestBody ExperienciaLaboral ex,@PathVariable("id") long id){
	        ex.setId(id);
	        return expservice.edit(ex);
	    }
    @PostMapping("/experiencias")
    public ExperienciaLaboral agregar(@RequestBody ExperienciaLaboral ex){
        return expservice.add(ex);
    }
    
    @DeleteMapping(path = {"/experiencias/{id}"})
    public ExperienciaLaboral delete(@PathVariable("id") long  id){
        return expservice.delete(id);
    }
    
    @GetMapping("/educacion/{id}")
   	public Educacion listarEd(@PathVariable("id") long id) {
   	return  educservice.listarId(id);
   }

       @PutMapping("/educacion/{id}")
   	 public Educacion editarEd(@RequestBody Educacion ex,@PathVariable("id") long id){
   	        ex.setId(id);
   	        return educservice.editEd(ex);
   	    }
       @PostMapping("/educacion")
       public Educacion agregar(@RequestBody Educacion ex){
           return educservice.add(ex);
       }
       
       @DeleteMapping(path = {"/educacion/{id}"})
       public Educacion deleteEd(@PathVariable("id") long  id){
           return educservice.deleteEd(id);
       }
	@GetMapping("/tecnologias/{id}")
	public Tecnologias listarTec(@PathVariable("id") long id) {
	return (Tecnologias) tecservice.listarTec(id);
}
	

    @PutMapping("/tecnologias/{id}")
	 public Tecnologias editarTec(@RequestBody Tecnologias t,@PathVariable("id") long id){
	        t.setId(id);
	        return tecservice.editTec(t);
	    }
    
    @PostMapping("/tecnologias")
    public Tecnologias agregar(@RequestBody Tecnologias t){
        return tecservice.add(t);
    }
    @DeleteMapping(path = {"/tecnologias/{id}"})
    public Tecnologias deleteTec(@PathVariable("id") long  id){
        return tecservice.deleteTec(id);
    }
	@GetMapping("/idiomas/{id}")
	public Idiomas listarLang(@PathVariable("id") long id) {
	return (Idiomas) langservice.listarLang(id);
}

    @PutMapping("/idiomas/{id}")
	 public Idiomas editarTec(@RequestBody Idiomas i,@PathVariable("id") long id){
	        i.setId(id);
	        return langservice.editLang(i);
	    }
    
    @PostMapping("/idiomas")
    public Idiomas agregarLang(@RequestBody Idiomas i){
        return langservice.addLang(i);
    }
    
    @DeleteMapping(path = {"/idiomas/{id}"})
    public Idiomas deleteLang(@PathVariable("id") long  id){
        return langservice.deleteLang(id);
    }
    
    
    
    @GetMapping("/personas/{id}")
   	public Persona listarP(@PathVariable("id") long id) {
   	return  persservice.listarP(id);
   }

       @PutMapping("/personas/{id}")
   	 public Persona editarP(@RequestBody Persona p,@PathVariable("id") long id){
   	        p.setId(id);
   	        return persservice.editP(p);
   	    }
       
       @GetMapping("/skills/{id}")
      	public SoftSkills listarSoft(@PathVariable("id") long id) {
      	return skillservice.listarSoft(id);
      }

        @PutMapping("/skills/{id}")
      	public SoftSkills editarSoft(@RequestBody SoftSkills s,@PathVariable("id") long id){
      	     s.setId(id);
      	        return  skillservice.editSoft(s);
      	    }
        @PostMapping("/skills")
        public SoftSkills agregarSkills(@RequestBody SoftSkills s){
            return skillservice.add(s);
        }
        
        @DeleteMapping(path = {"/skills/{id}"})
        public SoftSkills deleteSoft(@PathVariable("id") long  id){
            return skillservice.deleteSoft(id);
        }
        @GetMapping("/proyectos/{id}")
      	public Proyectos listarProj(@PathVariable("id") long id) {
      	return projservice.listarId(id);
      }

        @PutMapping("/proyectos/{id}")
      	public Proyectos editarSoft(@RequestBody Proyectos pr,@PathVariable("id") long id){
      	     pr.setId(id);
      	        return  projservice.edit(pr);
      	    }
        @PostMapping("/proyectos")
        public Proyectos agregarSkills(@RequestBody Proyectos pr){
            return projservice.add(pr);
        }
        @DeleteMapping(path = {"/proyectos/{id}"})
        public Proyectos deleteProj(@PathVariable("id") long  id){
            return projservice.delete(id);
        }
}
