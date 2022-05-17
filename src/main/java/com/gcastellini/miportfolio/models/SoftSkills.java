package com.gcastellini.miportfolio.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SoftSkills {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String skill;
	private String nivel;
	
	public long getId() {
	      return id;
	  }

	  public void setId(long id) {
	      this.id = id;
	  }
	  public String getSkill() {
	      return skill;
	  }

	  public void setSkill(String skill) {
	      this.skill = skill;
	  }
	  public String getNivel() {
	      return nivel;
	  }

	  public void setNivel(String nivel) {
	      this.nivel = nivel;
	  }
}
