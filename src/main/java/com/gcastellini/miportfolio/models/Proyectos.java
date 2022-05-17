package com.gcastellini.miportfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String nombre;
	private String fecha;
	private String descripcion;
	private String url;
	
	  public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }
	    
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    public String getFecha() {
	        return fecha;
	    }

	    public void setFecha(String fecha) {
	        this.fecha = fecha;
	    }
	    public String getDescripcion() {
	        return descripcion;
	    }
	       
	    public void setDescripcion(String descripcion) {
	            this.descripcion = descripcion;
	        }
	    public String getUrl() {
	        return url;
	    }
	       
	    public void setUrl(String url) {
	            this.url = url;
	        }
}
