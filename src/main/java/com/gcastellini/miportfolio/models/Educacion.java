package com.gcastellini.miportfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String instituto;
    private String carrera;
    private String periodo;
    private String url;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String institutp) {
        this.instituto = instituto;
    }
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
