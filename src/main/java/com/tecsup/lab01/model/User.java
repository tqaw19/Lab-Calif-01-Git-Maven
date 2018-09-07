package com.tecsup.lab01.model;

public class User {
	  public String nombres;
	  public String apellidoPaterno;
	  public Integer edad; 
    
	  public String getNombres() {
	        return nombres;
	    }

	    public void setNombres(String nombres) {
	        this.nombres = nombres;
	    }

	    public String getApellidoPaterno() {
	        return apellidoPaterno;
	    }

	    public void setApellidoPaterno(String apellidoPaterno) {
	        this.apellidoPaterno = apellidoPaterno;
	    }

	    public Integer getEdad() {
	        return edad;
	    }

	    public void setEdad(Integer edad) {
	        this.edad = edad;
	    }
	    
}
