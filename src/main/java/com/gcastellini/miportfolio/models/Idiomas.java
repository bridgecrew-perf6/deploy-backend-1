package com.gcastellini.miportfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Idiomas {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String idioma;
	private String nivel;
	
	public long getId() {
	      return id;
	  }

	  public void setId(long id) {
	      this.id = id;
	  }
	  
	  public String getIdioma() {
	      return idioma;
	  }

	  public void setIdioma(String idioma) {
	      this.idioma = idioma;
	  }
	  
	 public String getNivel() {
	      return nivel;
	  }

	  public void setNivel(String nivel) {
	      this.nivel = nivel;
	  }
}
