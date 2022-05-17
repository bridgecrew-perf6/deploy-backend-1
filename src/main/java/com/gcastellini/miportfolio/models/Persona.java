package com.gcastellini.miportfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nombre;
	private String foto;
	private String puesto;
	private String banner;
	private String descripcion;
	private String ciudad;
	
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
    	
    public String getFoto() {
        return foto;
    }
       
    public void setFoto(String foto) {
            this.foto = foto;
        }
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public String getBanner() {
        return banner;
    }
       
    public void setBanner(String banner) {
            this.banner = banner;
        }
    public String getDescripcion() {
        return descripcion;
    }
       
    public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    public String getCiudad() {
        return ciudad;
    }
       
    public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }
	

}
