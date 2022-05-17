package com.gcastellini.miportfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tecnologias {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String tecnologia;
  private String nivel;
  
  public long getId() {
      return id;
  }

  public void setId(long id) {
      this.id = id;
  }
  
  public String getTecnologia() {
      return tecnologia;
  }

  public void setTecnologia(String tecnologia) {
      this.tecnologia = tecnologia;
  }
  public String getNivel() {
      return nivel;
  }

  public void setNivel(String nivel) {
      this.nivel = nivel;
  }

}
